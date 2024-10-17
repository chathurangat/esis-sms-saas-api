docker network create esis_network

docker run -d \
--network esis_network \
-p 3302:3306 \
--name esis-mysql-service \
-e MYSQL_ROOT_PASSWORD=test123 \
mysql:latest

mvn clean install -DskipTests && sudo docker-compose build  &&  sudo docker-compose up -d


