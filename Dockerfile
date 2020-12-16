FROM maven:3.6-openjdk-11

COPY ./ /home/app/

WORKDIR /home/app

RUN mvn clean package

EXPOSE 8075

ENTRYPOINT java -jar truongiang-web/target/*.jar
