#!/bin/bash

#use set to enable verbose output
set -euo pipefail

readonly CONF=WEB-INF/classes/database.properties

# Change to webapp directory. Assumes there's only one webapp unpacked to tomcat.
cd $(find /var/lib/tomcat/webapps/ -type d -mindepth 1 -maxdepth 1 | head -n 1)

echo "current directory: " $PWD
echo "writing to file: " $CONF

# Write database config
cat > "${CONF}" <<-EOF
type=${DATABASE_TYPE}
host=${DATABASE_HOST}
database=${DATABASE_NAME}
user=${DATABASE_USER}
password=${DATABASE_PASSWORD}
EOF
