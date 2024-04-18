FROM eclipse-temurin:17-jre-alpine
COPY target/*.jar azure-example.jar
ENTRYPOINT ["java","-jar","/azure-example.jar"]
