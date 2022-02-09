#!/bin/bash
set -e

MY_DIR=$(cd "$(dirname "${BASH_SOURCE[0]}")" &> /dev/null && (pwd -W 2> /dev/null || pwd))
DOCKER_DIR="$MY_DIR"/docker

source "$DOCKER_DIR"/local-registry.sh up
#source "$SCRIPT_DIRS"/microservice_infrastructure.sh build
#source "$SCRIPT_DIRS"/microservice_infrastructure.sh up
#source "$SCRIPT_DIRS"/microservices.sh build
#source "$SCRIPT_DIRS"/microservices.sh up

read -p "************ Press enter to shutdown and cleanup everything ******************"

#source "$SCRIPT_DIRS"/microservices.sh down
#source "$SCRIPT_DIRS"/microservice_infrastructure.sh down
source "$DOCKER_DIR"/local-registry.sh down

source "$DOCKER_DIR"/remove_docker_images.sh
