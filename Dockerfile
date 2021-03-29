FROM anapsix/alpine-java
COPY oop_project.jar oop_project.jar
EXPOSE 8080
CMD ["java","-jar","oop_project.jar"]