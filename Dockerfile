FROM openjdk:8-jre-alpine
COPY target/app-runner.jar /opt/app/
COPY target/lib/* /opt/app/lib/
WORKDIR /opt/app/
EXPOSE 9099
CMD [ "java", "-jar", "/opt/app/app-runner.jar" ]