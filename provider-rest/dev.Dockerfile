FROM maven:3.6.3-jdk-13
MAINTAINER Mika Ropponen
RUN mkdir -p /opt/aoe-metadata-utils-dev
WORKDIR /opt/aoe-metadata-utils-dev
ADD . /opt/aoe-metadata-utils-dev
RUN mvn clean package -DskipTests
RUN sh -c 'touch ./target/provider-rest-0.0.1.jar'
ENTRYPOINT ["java","-Xms512m","-Xmx512m","-Djava.security.egd=file:/dev/./urandom","-jar","./target/provider-rest-0.0.1.jar"]