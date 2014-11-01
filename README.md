#Barebones Scala + Maven Project
Simple project showing build + test of scala with maven.

##Build
This will create a traditional jar.

- create: `mvn compile`

##Build Uberjar
This will create a jar with all dependencies bundled.

- create: `mvn package`
- run: `java -jar target/barebonesScala-0.0.0.jar`

##Test
This will run the unit tests

`mvn test`

**Note tests must be contained in a class that ends with xxxxTest. Tests should
be def methods that are anotated with @Test. See `MathSpec.scala` for example.
