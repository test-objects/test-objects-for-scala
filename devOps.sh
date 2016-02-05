#!/bin/sh

# ensure file referenced by compose exists
touch .devOps/env

# ensure machine running
command -v docker-machine && docker-machine start dev

# add in env
while IFS= read -r ENV_LINE
do
export ${ENV_LINE%%=*}="${ENV_LINE#*=}"
done < .devOps/env

# invoke requested dev op
docker-compose \
-f .devOps/$1/docker-compose.yml \
run \
--rm \
--service-ports \
$1 ${@:2}