#!/bin/sh
set -eu

# test: readonly variable
readonly test="1 2 3"
#* test=4

set -- $test

# 1 2 3
# 1 2 3
# 1
# 2
# 3
# variable.sh
#* $*
#* $@
#* $1
#* $2
#* $3
#* $0

arr[0]="foo"
arr[1]="bar"
arr[2]="buz"

IFS=":"

echo "${arr[*]}"
