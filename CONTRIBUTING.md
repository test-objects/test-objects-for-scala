## DEV OPS

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