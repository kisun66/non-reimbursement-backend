#Base가 될 이미지
FROM openjdk:8-jdk-alpine

# 8080포트 개방
EXPOSE 8080

ARG JAR_FILE=non_reimbursement.jar

# war파일 복사
COPY ${JAR_FILE} non_reimbursement.jar

ENTRYPOINT ["java","-jar","/non_reimbursement.jar","2>&1",">","non_reimbursement.log"]

# docker container의 timezone을 서울로 변경
# ENV TZ=Asia/Seoul
# RUN ln -ink /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
