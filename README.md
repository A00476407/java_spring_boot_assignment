# java_spring_boot_assignment
This is a Java Spring Boot application which is connected to a remote MySQL database and provide RESTful API to access the data.

# Database Setting
Schemas and sample data are put int data.sql. Run the SQL to get your database/table/data ready.
The connection can be updated in /SpringBootApp/src/main/resources/application.properties.

# Build and Run the application
1. Navigate to the /SpringBootApp directory
2. Run `mvn clean package`
3. Navigate to the /SpringBootApp/target directory
4. If you are using JASYPT encrypted password, run `java -Djasypt.encryptor.password=<secret-password> -jar SpringBootApp-0.0.1-SNAPSHOT.jar`. Otherwise, just run it without VM option by `java -jar SpringBootApp-0.0.1-SNAPSHOT.jar`

> [!NOTE]
> In my current configuration, my <secret-password> is my student ID.