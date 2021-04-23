FROM openjdk:8
VOLUME /tmp
EXPOSE 8888
ADD /target/speproject-0.0.1-SNAPSHOT.jar old-age-management.jar
ENTRYPOINT ["java", "-jar", "old-age-management.jar"]