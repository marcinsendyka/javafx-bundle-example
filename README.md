# javafx-bundle-example

This projects shows two ways of creating executable Java FX application.

1. Fat jar located in `fatjar` directory
1. JLink located in `jlink` directory.

##  Fat Jar

Fat Jar way is classic Java executable which is regular JAR file packed with all dependencies and special manifest file which tells Java how to find main class.
To easily pack all dependencies into single jar _maven-shade-plugin_ is used.

Steps to create:

1. Create wrapper for JavaFX application class. In this project wrapper is `javafx.bundle.example.StarterApp` and  JavaFX app is `javafx.bundle.example.App`
1. Add _maven-shade-plugin_ as in `plugins` section in `pom.xml` and put fully qualified name of your __wrapper__ class (see point above) in `mainClass` section.
1. Execute `mvn clean package` and executable jar will be created in `target/` directory.
1. To run application execute `java -jar target/<YOUR_PROJECT_NAME>-fatjar-1.0-SNAPSHOT.jar` or simply double click on jar from desktop file explorer.

## Jlink

JLink is fairly new tool introduced in Java9 with modules system (Jigsaw). As a result of this method, directory with tiny java distribution is created.

Steps to create:

1. Add _moditect-maven-plugin_ to `plugins` section in `pom.xml`. 
    - In `modules` section all dependencies which are not compliant with project Jigsaw have to be added (see example).
    - In `module` section put path to Java FX main class and to `module-info.java` file.
1. Add _maven-dependency-plugin_ as in example, so all dependencies will be copied into resulting directory file.
1. Execute `mvn clean package` and directory with application will be created at `target/jlink-image/` directory.
1. To run application execute `target/jlink-image/bin/app`