#!/bin/sh
ENV_NAME=$1
summon --provider summon-s3 -f .dev-op-spec/env.yml cat @SUMMONENVFILE > .dev-op-spec/env