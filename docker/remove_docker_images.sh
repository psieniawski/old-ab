#!/bin/bash

#remove our images from local docker cache
IMAGES="$(docker images --filter=reference="localhost:1000/*" -q)"
[[ ! -z $IMAGES ]] && docker rmi $IMAGES || echo "No images to remove."
