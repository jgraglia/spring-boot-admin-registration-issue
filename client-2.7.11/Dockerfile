FROM maven
ADD . /app/
WORKDIR /app
RUN mvn package
CMD java -jar target/client-2.7.11-1.0-SNAPSHOT.jar
