FROM anapsix/alpine-java
COPY opp_project.jar opp_project.jar
EXPOSE 8080
CMD ["java","-jar","oop_project.jar"]