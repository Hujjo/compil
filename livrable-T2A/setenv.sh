#!/bin/sh
ROOT="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
export CLASSPATH="$ROOT/lib/*:$ROOT/dist/lib/*"
