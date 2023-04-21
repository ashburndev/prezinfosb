# Spring Boot 3 Project Initial Setup

[return to README.md](/README.md)

I began the new Spring Boot 3 application by visiting https://start.spring.io/ and using the interface there to create and download 
the prezinfosb.zip file ("prezinfosb" is the name I selected for my "president info" application, "sb" is for spring boot).
The zip file contains all the files required for a simple Spring Boot 3 application.
At the time, version 3.0.4 was the newest Spring Boot 3 release.

```
Spring Initializr
https://start.spring.io/

Group:         ashburncode
Artifact:      prezinfosb
Name:          prezinfosb
Package name:  ashburncode.prezinfosb
Description:   spring boot 3.0.4, gradle project, jar packaging, java 17
Dependencies:
  Spring Web Web
    Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
  Spring Data JPA SQL
    Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
  Rest Repositories Web
    Exposing Spring Data repositories over REST via Spring Data REST.
  MySQL Driver SQL
    MySQL JDBC driver.
  Spring Boot Actuator Ops
    Supports built in (or custom) endpoints that let you monitor and manage your application - such as application health, metrics, sessions, etc.
  Thymeleaf Template Engines
    A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.
  Lombok Developer Tools
    Java annotation library which helps to reduce boilerplate code.
  Spring Boot DevTools Developer Tools
    Provides fast application restarts, LiveReload, and configurations for enhanced development experience.  
```

Most of my intial work on the project was guided by the two books and the web site below:

```
https://www.manning.com/books/spring-in-action-sixth-edition   Jan 2022 Craig Walls
https://www.manning.com/books/java-persistence-with-spring-data-and-hibernate   Jan 2023 Catalin Tudose
https://spring.io/guides/gs/accessing-data-mysql/
```

During development, I alternaed between using eclipse, spring tool suite (sts), and intelliJ idea (and vscode 1.77.0).

```
-rw-rw-r--  1 davidho davidho  555719346 Mar 17 05:52  eclipse-jee-2023-03-R-linux-gtk-x86_64.tar.gz
-rw-rw-r--  1 davidho davidho  321261795 Mar 17 05:56  eclipse-java-2023-03-R-linux-gtk-x86_64.tar.gz
-rw-rw-r--  1 davidho davidho  565545792 Mar 17 06:01  spring-tool-suite-4-4.18.0.RELEASE-e4.27.0-linux.gtk.x86_64.tar.gz
-rw-rw-r--  1 davidho davidho 1113623838 Apr  2 12:49  ideaIU-2023.1.tar.gz
-rw-rw-r--  1 davidho davidho  936649014 Apr  2 12:56  ideaIC-2023.1.tar.gz
-rw-rw-r--  1 davidho davidho      65395 Mar 21 06:21  prezinfosb.zip
```

```
davidho@dphxps17:~/Downloads$ 7z l prezinfosb.zip

7-Zip [64] 16.02 : Copyright (c) 1999-2016 Igor Pavlov : 2016-05-21
p7zip Version 16.02 (locale=en_US.UTF-8,Utf16=on,HugeFiles=on,64 bits,16 CPUs 11th Gen Intel(R) Core(TM) i7-11800H @ 2.30GHz (806D1),ASM,AES-NI)

Scanning the drive for archives:
1 file, 65395 bytes (64 KiB)

Listing archive: prezinfosb.zip

--
Path = prezinfosb.zip
Type = zip
Physical Size = 65395

   Date      Time    Attr         Size   Compressed  Name
------------------- ----- ------------ ------------  ------------------------
2023-03-21 10:21:36 D....            0            2  prezinfosb
2023-03-21 10:21:36 .....         2216          711  prezinfosb/HELP.md
2023-03-21 10:21:36 .....           32           34  prezinfosb/settings.gradle
2023-03-21 10:21:36 .....         2838         1195  prezinfosb/gradlew.bat
2023-03-21 10:21:36 .....          995          389  prezinfosb/build.gradle
2023-03-21 10:21:36 D....            0            2  prezinfosb/gradle
2023-03-21 10:21:36 D....            0            2  prezinfosb/gradle/wrapper
2023-03-21 10:21:36 .....          202          124  prezinfosb/gradle/wrapper/gradle-wrapper.properties
2023-03-21 10:21:36 .....        60756        54679  prezinfosb/gradle/wrapper/gradle-wrapper.jar
2023-03-21 10:21:36 .....          444          242  prezinfosb/.gitignore
2023-03-21 10:21:36 D....            0            2  prezinfosb/src
2023-03-21 10:21:36 D....            0            2  prezinfosb/src/main
2023-03-21 10:21:36 D....            0            2  prezinfosb/src/main/java
2023-03-21 10:21:36 D....            0            2  prezinfosb/src/main/java/ashburncode
2023-03-21 10:21:36 D....            0            2  prezinfosb/src/main/java/ashburncode/prezinfosb
2023-03-21 10:21:36 .....          323          172  prezinfosb/src/main/java/ashburncode/prezinfosb/PrezinfosbApplication.java
2023-03-21 10:21:36 D....            0            2  prezinfosb/src/main/resources
2023-03-21 10:21:36 D....            0            2  prezinfosb/src/main/resources/static
2023-03-21 10:21:36 D....            0            2  prezinfosb/src/main/resources/templates
2023-03-21 10:21:36 .....            1            3  prezinfosb/src/main/resources/application.properties
2023-03-21 10:21:36 D....            0            2  prezinfosb/src/test
2023-03-21 10:21:36 D....            0            2  prezinfosb/src/test/java
2023-03-21 10:21:36 D....            0            2  prezinfosb/src/test/java/ashburncode
2023-03-21 10:21:36 D....            0            2  prezinfosb/src/test/java/ashburncode/prezinfosb
2023-03-21 10:21:36 .....          218          153  prezinfosb/src/test/java/ashburncode/prezinfosb/PrezinfosbApplicationTests.java
2023-03-21 10:21:36 .....         8188         3519  prezinfosb/gradlew
------------------- ----- ------------ ------------  ------------------------
2023-03-21 10:21:36              76213        61251  11 files, 15 folders
davidho@dphxps17:~/Downloads$ 
davidho@dphxps17:~/Downloads$ cd ~/sbootprojs/prezinfosb/
davidho@dphxps17:~/sbootprojs/prezinfosb$ 
davidho@dphxps17:~/sbootprojs/prezinfosb$ ./gradlew --version

------------------------------------------------------------
Gradle 7.6.1
------------------------------------------------------------

Build time:   2023-02-24 13:54:42 UTC
Revision:     3905fe8ac072bbd925c70ddbddddf4463341f4b4

Kotlin:       1.7.10
Groovy:       3.0.13
Ant:          Apache Ant(TM) version 1.10.11 compiled on July 10 2021
JVM:          17.0.6 (Azul Systems, Inc. 17.0.6+10-LTS)
OS:           Linux 5.19.0-38-generic amd64

davidho@dphxps17:~/sbootprojs/prezinfosb$ 
```

