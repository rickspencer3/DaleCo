#!/bin/sh

set -eux

cd "$(dirname "$(basename "$0")")"

docker run --rm -v $(pwd):/app -w /app maven:3.5.2-jdk-8 mvn package
