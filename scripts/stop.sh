#!/usr/bin/env bash
if [ -z ${IDLE_PORT} ]
then
else
fi

#!/usr/bin/env bash

PROJECT_ROOT="/home/ec2-user/app/deploy"
JAR_NAME=$(ls -tr $REPOSITORY/*.jar | tail -n 1)

DEPLOY_LOG="$PROJECT_ROOT/deploy.log"

# 현재 구동 중인 애플리케이션 pid 확인
CURRENT_PID=$(pgrep -f $JAR_FILE)

# 프로세스가 켜져 있으면 종료
if [ -z $CURRENT_PID ]; then
    echo "> 현재 구동 중인 애플리케이션이 없으므로 종료하지 않습니다."
else
    echo "> kill -15 $IDLE_PID"
    kill -15 $CURRENT_PID
    sleep 5
fi
