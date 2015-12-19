#!/bin/sh

COUNT=10000

hoge() {
  for i in $(seq 1 $COUNT)
  do
    echo process
  done
}

# real	0m0.080s
# user	0m0.061s
# sys	0m0.010s
time hoge
