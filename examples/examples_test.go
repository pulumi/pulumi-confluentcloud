package examples

import (
	"os"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func getCwd(t *testing.T) string {
	cwd, err := os.Getwd()
	if err != nil {
		t.FailNow()
	}

	return cwd
}

func getBaseOptions(t *testing.T) integration.ProgramTestOptions {
	t.Skipf("Skipping due to https://github.com/pulumi/home/issues/3332")
	return integration.ProgramTestOptions{
		RunUpdateTest:        false,
		ExpectRefreshChanges: true,
	}
}
