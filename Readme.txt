docker image bauen:

mvnw package && java -jar target/kube-web.jar
docker build . -t kube-web
docker run -p 8080:8080 kube-web

start local postgres:

docker run --name postgresql-container -p 5432:5432 -e POSTGRES_PASSWORD=somePassword -d postgres
docker exec -it <PSQL-Container-ID> bash
psql -h localhost -p 5432 -U postgres -W