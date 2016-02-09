#!/bin/sh

PATH_TO_ENV_FILE=.dev-op-spec/.common/env

summon \
  -f .dev-op-spec/set-environment/env.yml \
  cat @SUMMONENVFILE > ${PATH_TO_ENV_FILE}

# handle no trailing newline until summon fixes bug
tail -c1 ${PATH_TO_ENV_FILE} | read -r _ || echo >> ${PATH_TO_ENV_FILE}