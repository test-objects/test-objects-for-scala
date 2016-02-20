# Prerequisites:
- install [docker-toolbox >=1.10](https://www.docker.com/products/docker-toolbox) then run `docker-machine create --driver virtualbox default` to create a default docker-machine
- install [docker-machine-nfs](https://github.com/adlogix/docker-machine-nfs) then run `docker-machine-nfs default` to update your docker-machine to use nfs (makes it way faster)
- run `docker-machine env default` and add the output to your bash_profile
- Install the [dev-op-spec CLI](https://github.com/dev-op-spec/cli#installation)
- run `docker ps` and if you don't get an error you're all set (smile)

# Getting started:

open a terminal 

- `git clone https://github.com/test-objects/test-objects-for-scala.git` and `cd` into the project
- `dev-op-spec pipelines run test` to run the test pipeline

## Dev Ops

This project adheres to the [dev op spec](http://devopspec.com/)
