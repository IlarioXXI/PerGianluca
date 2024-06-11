docker volume create data
docker network create pizzeria_network
docker run -v data:/app/data --name temp-container -d alpine
docker cp menu.txt temp-container:/app/data/menu.txt
docker cp ordini.txt temp-container:/app/data/ordini.txt
docker rm -f temp-container
