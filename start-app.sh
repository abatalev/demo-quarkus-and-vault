#!/bin/sh
export QUARKUS_VAULT_URL=$VAULT_ADDR
export QUARKUS_VAULT_AUTHENTICATION_CLIENT_TOKEN=$VAULT_TOKEN
java -jar /opt/app/app-runner.jar