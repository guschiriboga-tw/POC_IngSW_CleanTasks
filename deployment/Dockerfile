FROM adoptopenjdk/openjdk11-openj9:alpine-slim
VOLUME /tmp
COPY applications/app-service/build/libs/dojoCleanArch.jar dojoCleanArch.jar
RUN apk add curl
ENV JAVA_OPTS=" -Xshareclasses:name=cacheapp,cacheDir=/cache,nonfatal -XX:+UseContainerSupport -XX:MaxRAMPercentage=70 -Djava.security.egd=file:/dev/./urandom"
# Replace with a non-root user to avoid running the container with excessive privileges
USER root
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS  -Dspring.profiles.active=local -jar dojoCleanArch.jar" ]
