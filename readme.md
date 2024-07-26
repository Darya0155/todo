# build
```bash
mvn clean install
```

# How to start application locally

1. [run mysql docker container](https://github.com/Darya0155/docker-compose-example/blob/main/mysql/mysql-docker-compose.yml)
2. 

What content this starter contain

1. EnableDefault Actuator
2. Enable open api
3. logback.xml

urls for actuator
```
http://<host>:<port>/actuator

http://localhost:8080/actuator
```

openapi
```endpoints
http://localhost:8080/v3/api-docs
http://localhost:8080/swagger-ui/index.html
```

## fly way basic 
```text
Flyway supports the following basic commands to manage database migrations:

Info: Prints current status/version of a database schema. It prints which migrations are pending, which migrations have been applied, the status of applied migrations, and when they were applied.
Migrate: Migrates a database schema to the current version. It scans the classpath for available migrations and applies pending migrations.
Baseline: Baselines an existing database, excluding all migrations, including baselineVersion. Baseline helps to start with Flyway in an existing database. Newer migrations can then be applied normally.
Validate: Validates current database schema against available migrations.
Repair: Repairs metadata table.
Clean: Drops all objects in a configured schema. Of course, we should never use clean on any production database.
```
1. How to check info
```bash
mvn flyway:info -f app/pom.xml -Dflyway.user=root -Dflyway.password=admin -Dflyway.schemas=db -Dflyway.url=jdbc:mysql://localhost:3306/db 
```
2. How to run migration 
```bash
#mvn clean flyway:migrate -f app/pom.xml -Dflyway.user=root -Dflyway.password=admin -Dflyway.schemas=db -Dflyway.url=jdbc:mysql://localhost:3306/db
#mvn clean flyway:repair -f app/pom.xml -Dflyway.user=root -Dflyway.password=admin -Dflyway.schemas=db -Dflyway.url=jdbc:mysql://localhost:3306/db
 
```



# sonarQube
```bash
mvn clean verify sonar:sonar -Dsonar.projectKey=todo -Dsonar.projectName='todo' -Dsonar.host.url=http://localhost:9000 -Dsonar.token=
```
### What Are preConfigured in this Project
1. 