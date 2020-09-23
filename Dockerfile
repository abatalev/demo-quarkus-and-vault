FROM openjdk:11-jre-slim-buster
COPY target/app-runner.jar /opt/app/
COPY target/lib/* /opt/app/lib/
COPY start-app.sh /opt/app/
RUN chmod +x /opt/app/start-app.sh
WORKDIR /opt/app/
EXPOSE 9099
CMD [ "/opt/app/start-app.sh" ]