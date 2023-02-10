 
# PropertiesService
Stayhere Properties Service

# Run PropertiesService on local environment
Installations Needed
1. Install Java 11
2. Set up Apache Maven 3.6.3 to run spring boot
3. Install Docker

# Run local Development Mode
1. Navigate to root directory of the app and run `docker-compose up -d` to start mysql Database
2. Run `mvn spring-boot:run -e` to start the service 
3. Open your browser or Postman `http://localhost:8080/actuator` should get a json response with health details 

![img.png](img.png)

# Create New table Via Flyway
1. Create Db Script in /resources/db/migrations file Name should start V2__create/update_tablename .sql `V1__Create_categories_table`
2. Note Version should increment with new files V1,V2,V3...
3. See more details in file Naming here(https://flywaydb.org/documentation/concepts/migrations.html#naming)

