FROM maven
ADD . /app/
WORKDIR /app
RUN mvn package
CMD java -jar target/server-2.7.15-1.0-SNAPSHOT.jar
