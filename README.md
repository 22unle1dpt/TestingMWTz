In order to run the program, there are a few steps to take first:
(It is assumed that Docker Desktop is running and that the image of Postgre SQL already exists locally).

Required Docker commands:
1. docker run -e POSTGRES_PASSWORD=Welcome4$ -p 5432:5432 -d postgres
2. docker exec -it <NAME OF CONTAINER> bash 
    You can find out the name of the container with: "docker container ps".
3. psql -h localhost -U postgres
4. \l
    => displays the existing databases
5. \c postgres
    => Connect to database "postgres
6. \dt 
    => indicates that there are no tables
7. now we start the Java application
8. \dt now shows the created database tables
9. now we can execute the requests contained in the "Postman Collection" folder.
    => Basic CRUD functions are included for managing the diaries. The diary entries will follow.

