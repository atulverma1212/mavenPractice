##Concepts used

####1. Profiles 
test profile copies dev.properties in src/main/resources 
while prod profile copies prod.properties in the same. 

<code> mvn test -Ptest </code> <br>
<code> mvn test -Pprod </code>

####2. Clean
Cleans the build including src/main/resources/app.properties

<code> mvn clean </code>



