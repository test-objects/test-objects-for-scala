#!/bin/sh
ENV_NAME=$1
summon --provider summon-s3 -f .devOps/env.yml cat @SUMMONENVFILE > .devOps/env