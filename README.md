# DockerBase_RestApplication

steps to run this docker Applciation
1) Build Your Spring Boot Application
	mvn clean package
2) we have the docker file in project directory now Build the Docker Image using below command
# docker build -t [your-image-name] .
Ex : docker build -t springappimg .

3) Run the Docker Container:
# docker run -p 8080:8080 your-image-name
Ex :  docker run -p 8080:8080 springappimg

4) now open postman to hit the url
I) first Url
Post >>>http://localhost:8080/student/add
{
    "id": 6,
    "name": "ishaque",
    "address": "UK"
}

II) http://localhost:8080/student/get

