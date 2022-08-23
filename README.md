[![Actions Status](https://github.com/pulumi/pulumi-confluentcloud/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-confluentcloud/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fconfluentcloud.svg)](https://www.npmjs.com/package/@pulumi/confluentcloud)
[![Python version](https://badge.fury.io/py/pulumi-confluentcloud.svg)](https://pypi.org/project/pulumi-confluentcloud)
[![NuGet version](https://badge.fury.io/nu/pulumi.confluentcloud.svg)](https://badge.fury.io/nu/pulumi.confluentcloud)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-confluentcloud/sdk/go)](https://pkg.go.dev/github.com/pulumi/pulumi-confluentcloud/sdk/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-confluentcloud/blob/master/LICENSE)

# Confluent Cloud Resource Provider

The Confluent Resource Provider lets you manage [Confluent](https://confluent.cloud/) resources.

Please Note:
This provider is built from the ConfluentInc official Terraform Provider - https://github.com/confluentinc/terraform-provider-confluent

## Installing

This package is available for several languages/platforms:

### Node.js (JavaScript/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

```bash
npm install @pulumi/confluentcloud
```

or `yarn`:

```bash
yarn add @pulumi/confluentcloud
```

### Python

To use from Python, install using `pip`:

```bash
pip install pulumi_confluentcloud
```

### Go

To use from Go, use `go get` to grab the latest version of the library:

```bash
go get github.com/pulumi/pulumi-confluentcloud/sdk
```

### .NET

To use from .NET, install using `dotnet add package`:

```bash
dotnet add package Pulumi.ConfluentCloud
```

## Configuration

The following configuration points are available for the `confluent cloud` provider:

- `confluentcloud:cloudApiKey` (environment: `CONFLUENT_CLOUD_API_KEY`) - the API key for `Confluent Cloud`
- `confluentcloud:cloudApiSecret` (environment: `CONFLUENT_CLOUD_API_SECRET`) - the API secret for `Confluent Cloud`

## Reference

For detailed reference documentation, please visit [the Pulumi registry](https://www.pulumi.com/registry/packages/confluentcloud/api-docs/).
