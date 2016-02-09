#!/bin/sh
summon \
  -f .dev-op-spec/set-environment/env.yml \
  cat @SUMMONENVFILE > .dev-op-spec/.common/env