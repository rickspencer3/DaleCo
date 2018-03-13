#!/bin/bash

# This script configures the DaleCo example web app according to the following
# environment variables:
#
#   DATABASE_TYPE:
#       The type of database server - "mysql" or "postgres"
#   DATABASE_HOST:
#       The hostname to use to connect to the database
#   DATABASE_NAME:
#       The name of the database.
#   DATABASE_USER:
#       The root username for the database. You can connect as this user and
#       create other users if you require
#   DATABASE_PASSWORD:
#       The password for the root database user


# use set to enable verbose output
set -euo pipefail

readonly CONF=WEB-INF/classes/database.properties

# change to webapp directory. Assumes there's only one webapp unpacked to tomcat.
cd $(find /var/lib/tomcat/webapps/ -type d -mindepth 1 -maxdepth 1 | head -n 1)

echo "current directory: " $PWD
echo "writing to file: " $CONF

# write database config
cat > "${CONF}" <<-EOF
type=${DATABASE_TYPE}
host=${DATABASE_HOST}
database=${DATABASE_NAME}
user=${DATABASE_USER}
password=${DATABASE_PASSWORD}
EOF
