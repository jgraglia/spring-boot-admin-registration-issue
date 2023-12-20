FROM maven
ADD . /app
WORKDIR /app
RUN ls -alh .
RUN mvn package
RUN ls -alh .
CMD java -jar target/server-1.0-SNAPSHOT.jar
