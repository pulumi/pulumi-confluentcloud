package shim

import (
	"github.com/confluentinc/terraform-provider-confluent/internal/provider"
	"github.com/hashicorp/terraform-plugin-sdk/v2/helper/schema"
)

func NewProvider() *schema.Provider {
	return provider.New("")()
}
