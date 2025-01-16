# dockercompose-java-html
docker compose

**You can compile it using:**
javac HelloWorld.java

/project-directory
  ├── HelloWorld.java
  ├── HelloWorld.class
  ├── Dockerfile.java
  ├── Dockerfile.html
  ├── index.html
  └── docker-compose.yml

 ** Build and Run**
**To build and run the containers, use the following commands:**

docker-compose build
docker-compose up

-> The Java application will run in the java-hello-world container and output Hello, World from Java! to the logs.
-> The HTML application will be served via Nginx on port 8080 (accessible in your browser at http://localhost:8080).
