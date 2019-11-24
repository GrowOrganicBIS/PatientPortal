# Patient/Doctor Login Portal
## Download WampServer
download from here: https://downloads.bitnami.com/files/stacks/wampstack/7.3.11-0/bitnami-wampstack-7.3.11-0-windows-x64-installer.exe
## Set up WampServer
Once it is downloaded, install it, set up root mysql password for `root1234`. If you want to set up a password different than `root1234`,  you also need to change `spring.datasource.password` properties file in `src/main/resources/application.properties` to match the password you are setting.

In addition, log into phpMyAdmin GUI, create a table `test`, this table `test` will be used by properties `spring.datasource.url=jdbc:mysql://localhost:3306/test?useSSL=false` in application.properties file.
## Import this project as a maven project into intelliJ
## Run this project
`mvn clean spring-boot:run`
## Open the browser
Open `http://localhost:8080`

## Improvement
Later on, mysql and spring boot application will be embedded into a containerised environment, e.g. docker.
The whole application will be managed either by `docker-compose` or `kubernetes`
