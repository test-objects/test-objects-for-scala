#!/bin/sh

mkdir -p ~/.bintray/
cat <<EOF > ~/.bintray/.credentials
realm = Bintray API Realm
host = api.bintray.com
user = $BINTRAY_USERNAME
password = $BINTRAY_API_KEY
EOF
echo $BINTRAY_USERNAME

sbt publish