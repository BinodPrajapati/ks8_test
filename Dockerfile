FROM openjdk:8
EXPOSE 8080
ADD target/springbbot-ks8-demo.jar springbbot-ks8-demo.jar
ENTRYPOINT ["java", "-jar","/springbbot-ks8-demo.jar"]