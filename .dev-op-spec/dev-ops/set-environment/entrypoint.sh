#!/bin/sh

path_to_dev_ops_dir=.dev-op-spec/dev-ops
path_to_env_file=${path_to_dev_ops_dir}/.common/env

summon \
  -f ${path_to_dev_ops_dir}/set-environment/env.yml \
  cat @SUMMONENVFILE > ${path_to_env_file}

# handle no trailing newline until summon fixes bug
tail -c1 ${path_to_env_file} | read -r _ || echo >> ${path_to_env_file}