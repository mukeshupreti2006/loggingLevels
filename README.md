# loggingLevels
this project Descriptes different logging level and Spring security

Simple Logging Facade for Java (abbreviated SLF4J) – acts as a facade for different logging frameworks (e.g. java.util.logging, logback, Log4j). It offers a generic API making the logging independent of the actual implementation.

Logging Levels
--------------

ALL>TRACE>DEBUG>INFO>WARN>ERROR>FATAL>OFF

The Log4j2 Setup
----------------

<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-api</artifactId>
    <version>2.7</version>
</dependency>
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-core</artifactId>
    <version>2.7</version>
</dependency>
<dependency>
    <groupId>org.apache.logging.log4j</groupId>
    <artifactId>log4j-slf4j-impl</artifactId>
    <version>2.7</version>
</dependency>


Spring boot 
-----------


 <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-log4j2</artifactId>
        </dependency>
  _______________________________________________________________________________

The Logback Setup
------------------

<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.1.7</version>
</dependency>


comes with spring-boot-web
----------------------------
 <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>



-------------------------------------------------------------------------------------
The Log4j Setup
----------------

<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-log4j12</artifactId>
    <version>1.7.21</version>
</dependency>
<dependency>
    <groupId>log4j</groupId>
    <artifactId>log4j</artifactId>
    <version>1.2.17</version>
</dependency>


JCL Bridge Setup (jakarta common logging framerwork)
----------------

<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>jcl-over-slf4j</artifactId>
    <version>1.7.21</version>
</dependency>


