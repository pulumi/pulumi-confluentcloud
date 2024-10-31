package confluentcloud

import (
	"bytes"
	"fmt"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfgen"
	"os"
	"regexp"
)

func docEditRules(defaults []tfbridge.DocsEdit) []tfbridge.DocsEdit {
	edits := []tfbridge.DocsEdit{
		cleanUpExampleUsage,
		removeGuideText,
	}
	edits = append(edits,
		defaults...,
	)
	return append(
		edits,
		replaceWorkspaceWithStack,
		stripVideo,
		removeHelpfulLinksSection,
		removeStaticCredentialsSection,
	)
}

// Regexp for asciicast video link
var videoRegexp = regexp.MustCompile(`\[!\[asciicast\]\(http.*`)

// Removes an asciinema video link
var stripVideo = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		content = videoRegexp.ReplaceAll(content, nil)
		return content, nil
	},
}

// Removes a section with upstream provider related links
var removeHelpfulLinksSection = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
			return headerText == "Helpful Links/Information"
		})
	},
}

// Removes a section with upstream provider related links
var removeStaticCredentialsSection = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		return tfgen.SkipSectionByHeaderContent(content, func(headerText string) bool {
			return headerText == "Static Credentials"
		})
	},
}

var removeGuideText = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		inputs := [][]byte{
			[]byte("The navigation menu provides details about the resources that you can interact with " +
				"(_Resources_), and a guide (_Guides_) for how you can get started."),
			[]byte("# See https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/" +
				"configurations/managing-single-kafka-cluster for more details\n"),
			[]byte("# See https://github.com/confluentinc/terraform-provider-confluent/tree/master/examples/" +
				"configurations/managing-single-schema-registry-cluster for more details\n"),
		}
		for _, input := range inputs {

			if bytes.Contains(content, input) {
				content = bytes.ReplaceAll(
					content,
					input,
					nil)
			} else {
				// Hard error to ensure we keep this content up to date
				return nil, fmt.Errorf("could not find text in upstream index.md, "+
					"please verify input at removeGuideText \n*****\n%s\n*****\n", string(input))
			}
		}
		return content, nil
	},
}

var cleanUpExampleUsage = tfbridge.DocsEdit{
	Path: "index.md",
	Edit: func(_ string, content []byte) ([]byte, error) {
		replacesDir := "docs/index-md-replaces/"
		changes := []string{
			"example-usage-subtitle",
			"example-usage",
		}
		for _, file := range changes {

			input, err := os.ReadFile(replacesDir + file + "-input.md")
			if err != nil {
				return nil, err
			}
			desired, err := os.ReadFile(replacesDir + file + "-desired.md")
			if err != nil {
				return nil, err
			}
			if bytes.Contains(content, input) {
				content = bytes.ReplaceAll(
					content,
					input,
					desired)
			} else {
				// Hard error to ensure we keep this content up to date
				return nil, fmt.Errorf("could not find text in upstream index.md, "+
					"please verify file content at %s\n*****\n%s\n*****\n", replacesDir+file+"-input.md", string(input))
			}
		}

		return content, nil
	},
}

// TODO: The below can be reverted if we decide to
// Regexp for Terraform W/workspace
var workspaceRegexp = regexp.MustCompile(`Terraform [Ww]orkspace`)

// Replaces "Terraform Workspace" with "Pulumi Stack"
var replaceWorkspaceWithStack = tfbridge.DocsEdit{
	Path: "*",
	Edit: func(_ string, content []byte) ([]byte, error) {
		content = workspaceRegexp.ReplaceAll(content, []byte("Pulumi Stack"))
		return content, nil
	},
}
