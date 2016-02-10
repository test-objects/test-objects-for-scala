## Dev Ops

This project adheres to the [dev op spec](http://devopspec.com/)

### Configuration
configuration is obtained via [summon](http://conjurinc.github.io/summon/)
for supported values see [env.yml](.dev-op-spec/dev-ops/set-environment/env.yml)

### Available Dev Ops

```shell
# requires following environment variables present
#   - AWS_ACCESS_KEY_ID
#   - AWS_SECRET_ACCESS_KEY
./dev-op-spec dev-ops run set-environment
```

```shell
./dev-op-spec dev-ops run unit-test
```

```shell
./dev-op-spec dev-ops run publish
```

## Required Software (by platform)

### OSX
|name|
|---|
|[docker-toolbox >=1.10](https://www.docker.com/products/docker-toolbox)|
|[docker-machine-nfs](https://github.com/adlogix/docker-machine-nfs)|
