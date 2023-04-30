FROM openjdk:17-alpine AS build
VOLUME /build
RUN mkdir /work
COPY . /work
WORKDIR /work
RUN /work/gradlew bootJar
RUN mv /work/build/libs/*.jar /work/app.jar

FROM openjdk:17-alpine
WORKDIR /data
COPY --from=build /work/app.jar /data
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/data/app.jar"]