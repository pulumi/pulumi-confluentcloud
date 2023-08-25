//go:build nodejs || all
// +build nodejs all

package examples

import (
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestAccEnvironmentTs(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "environment", "ts"),
		})

	integration.ProgramTest(t, &test)
}

// TestKafkaTopicPatch tests that upstream patches to add in the deprecated httpEndpoint field works as expected.
func TestKafkaTopicPatch(t *testing.T) {
	test := getJSBaseOptions(t).
		With(integration.ProgramTestOptions{
			Dir:                    path.Join(getCwd(t), "kafka-topic-patch", "ts", "step1"),
			SkipEmptyPreviewUpdate: true,
			EditDirs: []integration.EditDir{
				{
					Dir:             path.Join(getCwd(t), "kafka-topic-patch", "ts", "step2"),
					Additive:        true,
					ExpectNoChanges: false,
				},
			},
		})

	integration.ProgramTest(t, &test)
}

func getJSBaseOptions(t *testing.T) integration.ProgramTestOptions {
	base := getBaseOptions()
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/confluentcloud",
		},
	})

	return baseJS
}
