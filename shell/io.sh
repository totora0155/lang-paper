#!/bin/sh
set -eu

# ...
echo 'foo' > /dev/null

# ...
# a.txt
# cd: no such file or directory: not_exists
cd not_exists/ 2> a.txt
#* ls
#* cat a.txt

# ...
# a.txt
# cd: no such file or directory: not_exists
cd not_exists/ > a.txt 2>&1
