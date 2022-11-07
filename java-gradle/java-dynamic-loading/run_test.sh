#!/bin/bash

unset JAVA_TOOL_OPTIONS && \
JAVA_TOOL_OPTIONS= java -jar /build/libs/rookoutDemo-1.0.0.jar & \
export ROOKOUT_TARGET_PID=$(ps -ef | grep 'java -jar /build/libs/rookoutDemo-1.0.0.jar' | grep -v grep | awk '{print $2}') && \
JAVA_TOOL_OPTIONS= java -jar /home/jenkins/agent/rook.jar &