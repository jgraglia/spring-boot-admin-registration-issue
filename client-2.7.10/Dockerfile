FROM maven
ADD . /app
WORKDIR /app
RUN ls -alh .
RUN mvn package
RUN ls -alh .
CMD java -jar target/client-2.7.10-1.0-SNAPSHOT.jar
