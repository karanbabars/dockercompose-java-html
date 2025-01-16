# Dockerfile.java for Java Application
FROM openjdk:11-jre-slim
COPY HelloWorld.class /usr/src/myapp/
WORKDIR /usr/src/myapp
CMD ["java", "HelloWorld"]

