-- Local MySQL

docker run -d -p 3306:3306 -e MYSQL_ROOT_PASSWORD=ychat@@00 -e MYSQL_DATABASE=Backoffice -e MYSQL_USER=ychatUser -e MYSQL_PASSWORD=ychat@@00 mysql

CREATE DATABASE ychatdb; 

