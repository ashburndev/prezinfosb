# Spring Data JPA and @Id annotations

I created a Spring Boot 3.0.4 web application and have been testing different @Id annotations.

## Spring Boot 3 Project Initial Setup

[springboot 3 project initial setup](/doc/springboot-proj-initial-setup.md)

In separate experiments, I have tried each of the annotations below.  In each experiment, I allowed Spring Boot Data JPA to generate the tables in an otherwise empty MySQL 8 database.  In between each experiment, I dropped and created the database.

```
davidho@dphxps17:~$ 
davidho@dphxps17:~$ uname -a
Linux dphxps17 5.19.0-40-generic #41~22.04.1-Ubuntu SMP PREEMPT_DYNAMIC Fri Mar 31 16:00:14 UTC 2 x86_64 x86_64 x86_64 GNU/Linux
davidho@dphxps17:~$ 
davidho@dphxps17:~$ mysql --version
mysql  Ver 8.0.32-0ubuntu0.22.04.2 for Linux on x86_64 ((Ubuntu))
davidho@dphxps17:~$ 
davidho@dphxps17:~$ mysql -u root -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.32-0ubuntu0.22.04.2 (Ubuntu)

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> 

DROP DATABASE IF EXISTS prezdbsb;
CREATE DATABASE prezdbsb;
GRANT ALL PRIVILEGES ON prezdbsb.* TO 'prez'@'localhost' WITH GRANT OPTION;
```

I wanted to see the resulting table structure generated by each of the annotations.  More specifically, I wanted to compare each generated table structure against the schema of our existing project database.  Where differences exist, I want to understand if the differences might cause problems.

## @GeneratedValue(strategy = GenerationType.AUTO)

[springboot data jpa mysql generationtype auto](/doc/springboot-data-jpa-mysql-generationtype-auto.md)

```
mysql> show tables;
+--------------------+
| Tables_in_prezdbsb |
+--------------------+
| election           |
| election_seq       |
| president          |
| president_seq      |
| term               |
| term_seq           |
+--------------------+
6 rows in set (0.00 sec)

mysql>
```

## @GeneratedValue(strategy = GenerationType.IDENTITY)

[springboot data jpa mysql generationtype identity](/doc/springboot-data-jpa-mysql-generationtype-identity.md)

```
mysql> show tables;
+--------------------+
| Tables_in_prezdbsb |
+--------------------+
| election           |
| president          |
| term               |
+--------------------+
3 rows in set (0.01 sec)

mysql> 
```

## @GeneratedValue(strategy = GenerationType.SEQUENCE)

[springboot data jpa mysql generationtype sequence](/doc/springboot-data-jpa-mysql-generationtype-sequence.md)

```
mysql> show tables;
+--------------------+
| Tables_in_prezdbsb |
+--------------------+
| election           |
| election_seq       |
| president          |
| president_seq      |
| term               |
| term_seq           |
+--------------------+
6 rows in set (0.00 sec)

mysql>
```

## @GeneratedValue(strategy = GenerationType.TABLE)

[springboot data jpa mysql generationtype table](/doc/springboot-data-jpa-mysql-generationtype-table.md)

```
mysql> show tables;
+---------------------+
| Tables_in_prezdbsb  |
+---------------------+
| election            |
| hibernate_sequences |
| president           |
| term                |
+---------------------+
4 rows in set (0.00 sec)

mysql>
```

## @GeneratedValue(strategy = GenerationType.UUID)

[springboot data jpa mysql generationtype uuid](/doc/springboot-data-jpa-mysql-generationtype-uuid.md)

```
mysql> use prezdbsb;
Database changed
mysql> show tables;
Empty set (0.00 sec)

mysql> 
```

## @GenericGenerator(name = "hibernate_sequence", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",

[springboot data jpa mysql genericgenerator uuid](/doc/springboot-data-jpa-mysql-genericgenerator.md)

```
@Id
@GeneratedValue(generator = "hibernate_sequence")
@GenericGenerator(name = "hibernate_sequence", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
  @Parameter(name = "sequence_name", value = "hibernate_sequence"), @Parameter(name = "initial_value", value = "1"),
  @Parameter(name = "increment_size", value = "1") })
private Long id;
```

```
mysql> show tables;
+--------------------+
| Tables_in_prezdbsb |
+--------------------+
| election           |
| hibernate_sequence |
| president          |
| term               |
+--------------------+
4 rows in set (0.00 sec)

mysql>
```

