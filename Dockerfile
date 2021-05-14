FROM openjdk:8
#VOLUME /tmp
EXPOSE 8085
ADD target/old-age-management.jar old-age-management.jar
ENTRYPOINT ["java", "-jar", "old-age-management.jar"]