#!/bin/sh
summon \
  -f .dev-op-spec/set-environment/env.yml \
  tail -c1 @SUMMONENVFILE | read -r _ || echo > .dev-op-spec/.common/env