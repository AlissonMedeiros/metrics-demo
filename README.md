# metrics-demo

mvn clean install -f metrics-demo/pom.xml

docker build -f metrics-demo/src/main/docker/Dockerfile.jvm -t quarkus/metrics-demo-jvm .

docker-compose -f .docker-compose/application.yml up

docker rm -vf (docker ps -a -q)
docker volume prune -f
