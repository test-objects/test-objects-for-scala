![build status](https://travis-ci.org/chrisdostert/test-objects-for-scala.svg?branch=master)

# Versioning

The versioning of this project adheres to the [Semantic Versioning 2.0.0](http://semver.org/spec/v2.0.0.html) spec

# License

This code is open source software licensed under the [Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0).

# Contributing

## Dev Ops

### Configuration
configuration is obtained via [summon](http://conjurinc.github.io/summon/)
for supported values see [env.yml](.devOps/env.yml)

### Scripts

set the environment

*note: this requires you've created an env_auth.env (see [template](.devOps/env_auth.env.template)) in the [.devOps dir](.devOps/)
```shell
./devOps.sh setEnv
```

unit test 
```shell
./devOps.sh unitTest
```

publish
```shell
./devOps.sh publish
```

## Required Software (by platform)

### Mac
|name|
|---|
|[docker-toolbox >=1.10](https://www.docker.com/products/docker-toolbox)|
|[docker-machine-nfs](https://github.com/adlogix/docker-machine-nfs)|