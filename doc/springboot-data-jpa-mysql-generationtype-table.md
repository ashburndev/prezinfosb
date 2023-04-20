# @GeneratedValue(strategy = GenerationType.TABLE)

[return to README.md](/README.md)

```
@Id
@GeneratedValue(strategy = GenerationType.TABLE)
private Long id;
```

```
use prezdbsb;
show tables;
desc president;
desc election;
desc term;
desc hibernate_sequences;
select id, created_at, first_name, last_name, middle_name, political_party from president;
select id, created_at, president_id, election_date, incumb_won_election from election;
select id, created_at, president_id, beg_date, end_date from term;
select * from hibernate_sequences;
```

```
mysql> 
mysql> use prezdbsb;
Database changed
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

mysql> desc president;
+---------------------+--------------+------+-----+---------+-------+
| Field               | Type         | Null | Key | Default | Extra |
+---------------------+--------------+------+-----+---------+-------+
| id                  | bigint       | NO   | PRI | NULL    |       |
| created_at          | datetime(6)  | NO   |     | NULL    |       |
| first_inaug_address | text         | YES  |     | NULL    |       |
| first_inaug_date    | datetime(6)  | YES  |     | NULL    |       |
| first_name          | varchar(255) | YES  |     | NULL    |       |
| last_name           | varchar(255) | YES  |     | NULL    |       |
| middle_name         | varchar(255) | YES  |     | NULL    |       |
| modified_at         | datetime(6)  | YES  |     | NULL    |       |
| political_party     | varchar(255) | YES  |     | NULL    |       |
+---------------------+--------------+------+-----+---------+-------+
9 rows in set (0.00 sec)

mysql> desc election;
+-------------------------------+---------------+------+-----+---------+-------+
| Field                         | Type          | Null | Key | Default | Extra |
+-------------------------------+---------------+------+-----+---------+-------+
| id                            | bigint        | NO   | PRI | NULL    |       |
| created_at                    | datetime(6)   | NO   |     | NULL    |       |
| election_date                 | datetime(6)   | YES  |     | NULL    |       |
| incumb_won_election           | bit(1)        | YES  |     | NULL    |       |
| modified_at                   | datetime(6)   | YES  |     | NULL    |       |
| percent_winner_electoral_vote | float         | YES  |     | NULL    |       |
| percent_winner_popular_vote   | double        | YES  |     | NULL    |       |
| total_electoral_vote          | int           | YES  |     | NULL    |       |
| total_popular_vote            | bigint        | YES  |     | NULL    |       |
| winner_electoral_vote         | int           | YES  |     | NULL    |       |
| winner_popular_vote           | bigint        | YES  |     | NULL    |       |
| zzz_big_decimal_value         | decimal(38,2) | YES  |     | NULL    |       |
| zzz_big_integer_value         | decimal(38,0) | YES  |     | NULL    |       |
| zzz_byte_value                | tinyint       | YES  |     | NULL    |       |
| zzz_character_value           | char(1)       | YES  |     | NULL    |       |
| zzz_short_value               | smallint      | YES  |     | NULL    |       |
| president_id                  | bigint        | YES  | MUL | NULL    |       |
+-------------------------------+---------------+------+-----+---------+-------+
17 rows in set (0.00 sec)

mysql> desc term;
+--------------+-------------+------+-----+---------+-------+
| Field        | Type        | Null | Key | Default | Extra |
+--------------+-------------+------+-----+---------+-------+
| id           | bigint      | NO   | PRI | NULL    |       |
| beg_date     | datetime(6) | YES  |     | NULL    |       |
| created_at   | datetime(6) | NO   |     | NULL    |       |
| end_date     | datetime(6) | YES  |     | NULL    |       |
| modified_at  | datetime(6) | YES  |     | NULL    |       |
| president_id | bigint      | YES  | MUL | NULL    |       |
+--------------+-------------+------+-----+---------+-------+
6 rows in set (0.00 sec)

mysql> desc hibernate_sequences;
+---------------+--------------+------+-----+---------+-------+
| Field         | Type         | Null | Key | Default | Extra |
+---------------+--------------+------+-----+---------+-------+
| sequence_name | varchar(255) | NO   | PRI | NULL    |       |
| next_val      | bigint       | YES  |     | NULL    |       |
+---------------+--------------+------+-----+---------+-------+
2 rows in set (0.00 sec)

mysql> select id, created_at, first_name, last_name, middle_name, political_party from president;
+----+----------------------------+------------+------------+-------------+-----------------------+
| id | created_at                 | first_name | last_name  | middle_name | political_party       |
+----+----------------------------+------------+------------+-------------+-----------------------+
|  1 | 2023-04-20 07:28:36.166000 | George     | Washington |             | Unaffiliated          |
|  2 | 2023-04-20 07:28:36.193000 | John       | Adams      |             | Federalist            |
|  3 | 2023-04-20 07:28:36.203000 | Thomas     | Jefferson  |             | Democratic-Republican |
|  4 | 2023-04-20 07:28:36.207000 | James      | Madison    |             | Democratic-Republican |
|  5 | 2023-04-20 07:28:36.210000 | James      | Monroe     |             | Democratic-Republican |
|  6 | 2023-04-20 07:28:36.213000 | John       | Adams      | Quincy      | Democratic-Republican |
|  7 | 2023-04-20 07:28:36.216000 | Andrew     | Jackson    |             | Democratic            |
|  8 | 2023-04-20 07:28:36.218000 | Martin     | Van Buren  |             | Democratic            |
|  9 | 2023-04-20 07:28:36.221000 | William    | Harrison   | Henry       | Whig                  |
| 10 | 2023-04-20 07:28:36.224000 | John       | Tyler      |             | Whig                  |
| 11 | 2023-04-20 07:28:36.226000 | James      | Polk       | K           | Democratic            |
| 12 | 2023-04-20 07:28:36.229000 | Zachary    | Taylor     |             | Whig                  |
| 13 | 2023-04-20 07:28:36.232000 | Millard    | Fillmore   |             | Whig                  |
| 14 | 2023-04-20 07:28:36.235000 | Franklin   | Pierce     |             | Democratic            |
| 15 | 2023-04-20 07:28:36.238000 | James      | Buchanan   |             | Democratic            |
| 16 | 2023-04-20 07:28:36.240000 | Abraham    | Lincoln    |             | Republican            |
| 17 | 2023-04-20 07:28:36.243000 | Andrew     | Johnson    |             | Democratic            |
| 18 | 2023-04-20 07:28:36.245000 | Ulysses    | Grant      | S.          | Republican            |
| 19 | 2023-04-20 07:28:36.248000 | Rutherford | Hayes      | B.          | Republican            |
| 20 | 2023-04-20 07:28:36.250000 | James      | Garfield   | A.          | Republican            |
| 21 | 2023-04-20 07:28:36.253000 | Chester    | Arthur     | A.          | Republican            |
| 22 | 2023-04-20 07:28:36.255000 | Grover     | Cleveland  |             | Democratic            |
| 23 | 2023-04-20 07:28:36.257000 | Benjamin   | Harrison   |             | Republican            |
| 24 | 2023-04-20 07:28:36.260000 | William    | McKinley   |             | Republican            |
| 25 | 2023-04-20 07:28:36.262000 | Theodore   | Roosevelt  |             | Republican            |
| 26 | 2023-04-20 07:28:36.265000 | William    | Taft       | Howard      | Republican            |
| 27 | 2023-04-20 07:28:36.267000 | Woodrow    | Wilson     |             | Democratic            |
| 28 | 2023-04-20 07:28:36.270000 | Warren     | Harding    | G.          | Republican            |
| 29 | 2023-04-20 07:28:36.272000 | Calvin     | Coolidge   |             | Republican            |
| 30 | 2023-04-20 07:28:36.274000 | Herbert    | Hoover     |             | Republican            |
| 31 | 2023-04-20 07:28:36.277000 | Franklin   | Roosevelt  | D.          | Democratic            |
| 32 | 2023-04-20 07:28:36.279000 | Harry      | Truman     | S.          | Democratic            |
| 33 | 2023-04-20 07:28:36.282000 | Dwight     | Eisenhower | D.          | Republican            |
| 34 | 2023-04-20 07:28:36.284000 | John       | Kennedy    | F.          | Democratic            |
| 35 | 2023-04-20 07:28:36.286000 | Lyndon     | Johnson    | B.          | Democratic            |
| 36 | 2023-04-20 07:28:36.289000 | Richard    | Nixon      |             | Republican            |
| 37 | 2023-04-20 07:28:36.291000 | Gerald     | Ford       |             | Republican            |
| 38 | 2023-04-20 07:28:36.293000 | Jimmy      | Carter     |             | Democratic            |
| 39 | 2023-04-20 07:28:36.296000 | Ronald     | Reagan     |             | Republican            |
| 40 | 2023-04-20 07:28:36.314000 | George     | Bush       | H. W.       | Republican            |
| 41 | 2023-04-20 07:28:36.319000 | Bill       | Clinton    |             | Democratic            |
| 42 | 2023-04-20 07:28:36.322000 | George     | Bush       | W.          | Republican            |
| 43 | 2023-04-20 07:28:36.324000 | Barack     | Obama      |             | Democratic            |
| 44 | 2023-04-20 07:28:36.326000 | Donald     | Trump      |             | Republican            |
| 45 | 2023-04-20 07:28:36.328000 | Joe        | Biden      |             | Democratic            |
+----+----------------------------+------------+------------+-------------+-----------------------+
45 rows in set (0.00 sec)

mysql> select id, created_at, president_id, election_date, incumb_won_election from election;
+----+----------------------------+--------------+----------------------------+------------------------------------------+
| id | created_at                 | president_id | election_date              | incumb_won_election                      |
+----+----------------------------+--------------+----------------------------+------------------------------------------+
| 52 | 2023-04-20 07:28:36.296000 |           39 | 1980-11-04 00:00:00.000000 | 0x00                                     |
| 53 | 2023-04-20 07:28:36.296000 |           39 | 1984-11-06 00:00:00.000000 | 0x01                                     |
+----+----------------------------+--------------+----------------------------+------------------------------------------+
2 rows in set (0.00 sec)

mysql> select id, created_at, president_id, beg_date, end_date from term;
+-----+----------------------------+--------------+----------------------------+----------------------------+
| id  | created_at                 | president_id | beg_date                   | end_date                   |
+-----+----------------------------+--------------+----------------------------+----------------------------+
| 102 | 2023-04-20 07:28:36.296000 |           39 | 1981-01-20 00:00:00.000000 | 1985-01-20 00:00:00.000000 |
| 103 | 2023-04-20 07:28:36.296000 |           39 | 1985-01-20 00:00:00.000000 | 1989-01-20 00:00:00.000000 |
+-----+----------------------------+--------------+----------------------------+----------------------------+
2 rows in set (0.00 sec)

mysql> select * from hibernate_sequences;
+---------------+----------+
| sequence_name | next_val |
+---------------+----------+
| default       |      200 |
+---------------+----------+
1 row in set (0.00 sec)

mysql> 
```

```
davidho@dphxps17:~/sbootprojs/prezinfosb$ 
davidho@dphxps17:~/sbootprojs/prezinfosb$ ./gradlew bootRun

> Task :compileJava
Note: /home/davidho/sbootprojs/prezinfosb/src/main/java/ashburncode/prezinfosb/controller/PresidentController.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

> Task :bootRun

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.0.4)

2023-04-20T07:28:33.735-04:00  INFO 58909 --- [           main] a.prezinfosb.PrezinfosbApplication       : Starting PrezinfosbApplication using Java 17.0.6 with PID 58909 (/home/davidho/sbootprojs/prezinfosb/build/classes/java/main started by davidho in /home/davidho/sbootprojs/prezinfosb)
2023-04-20T07:28:33.737-04:00  INFO 58909 --- [           main] a.prezinfosb.PrezinfosbApplication       : No active profile set, falling back to 1 default profile: "default"
2023-04-20T07:28:34.136-04:00  INFO 58909 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2023-04-20T07:28:34.160-04:00  INFO 58909 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 20 ms. Found 3 JPA repository interfaces.
2023-04-20T07:28:34.426-04:00  INFO 58909 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-04-20T07:28:34.431-04:00  INFO 58909 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-04-20T07:28:34.431-04:00  INFO 58909 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.5]
2023-04-20T07:28:34.474-04:00  INFO 58909 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-04-20T07:28:34.474-04:00  INFO 58909 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 711 ms
2023-04-20T07:28:34.587-04:00  INFO 58909 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2023-04-20T07:28:34.611-04:00  INFO 58909 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.1.7.Final
2023-04-20T07:28:34.730-04:00  INFO 58909 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-04-20T07:28:34.883-04:00  INFO 58909 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@53ba7997
2023-04-20T07:28:34.884-04:00  INFO 58909 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2023-04-20T07:28:34.893-04:00  INFO 58909 --- [           main] SQL dialect                              : HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
2023-04-20T07:28:34.894-04:00  WARN 58909 --- [           main] org.hibernate.orm.deprecation            : HHH90000026: MySQL8Dialect has been deprecated; use org.hibernate.dialect.MySQLDialect instead
2023-04-20T07:28:34.984-04:00  INFO 58909 --- [           main] o.hibernate.id.enhanced.TableGenerator   : HHH000398: Explicit segment value for id generator [hibernate_sequences.sequence_name] suggested; using default [default]
2023-04-20T07:28:34.986-04:00  INFO 58909 --- [           main] o.hibernate.id.enhanced.TableGenerator   : HHH000398: Explicit segment value for id generator [hibernate_sequences.sequence_name] suggested; using default [default]
2023-04-20T07:28:34.986-04:00  INFO 58909 --- [           main] o.hibernate.id.enhanced.TableGenerator   : HHH000398: Explicit segment value for id generator [hibernate_sequences.sequence_name] suggested; using default [default]
2023-04-20T07:28:35.347-04:00  WARN 58909 --- [           main] o.h.t.s.i.ExceptionHandlerLoggedImpl     : GenerationTarget encountered exception accepting command : Error executing DDL "
    insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement

org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "
    insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:67) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.applySqlString(AbstractSchemaMigrator.java:587) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.applySqlStrings(AbstractSchemaMigrator.java:532) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.createTable(AbstractSchemaMigrator.java:307) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.internal.GroupedSchemaMigratorImpl.performTablesMigration(GroupedSchemaMigratorImpl.java:79) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.performMigration(AbstractSchemaMigrator.java:225) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.doMigration(AbstractSchemaMigrator.java:126) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:284) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.lambda$process$5(SchemaManagementToolCoordinator.java:143) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at java.base/java.util.HashMap.forEach(HashMap.java:1421) ~[na:na]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:140) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:336) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:415) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1423) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:66) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:376) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:352) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1808) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1758) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:599) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:521) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1132) ~[spring-context-6.0.6.jar:6.0.6]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:907) ~[spring-context-6.0.6.jar:6.0.6]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:584) ~[spring-context-6.0.6.jar:6.0.6]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:732) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:434) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:310) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1304) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1293) ~[spring-boot-3.0.4.jar:3.0.4]
        at ashburncode.prezinfosb.PrezinfosbApplication.main(PrezinfosbApplication.java:22) ~[main/:na]
Caused by: java.sql.SQLIntegrityConstraintViolationException: Duplicate entry 'default' for key 'hibernate_sequences.PRIMARY'
        at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:117) ~[mysql-connector-j-8.0.32.jar:8.0.32]
        at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:122) ~[mysql-connector-j-8.0.32.jar:8.0.32]
        at com.mysql.cj.jdbc.StatementImpl.executeInternal(StatementImpl.java:763) ~[mysql-connector-j-8.0.32.jar:8.0.32]
        at com.mysql.cj.jdbc.StatementImpl.execute(StatementImpl.java:648) ~[mysql-connector-j-8.0.32.jar:8.0.32]
        at com.zaxxer.hikari.pool.ProxyStatement.execute(ProxyStatement.java:94) ~[HikariCP-5.0.1.jar:na]
        at com.zaxxer.hikari.pool.HikariProxyStatement.execute(HikariProxyStatement.java) ~[HikariCP-5.0.1.jar:na]
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:54) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        ... 36 common frames omitted

2023-04-20T07:28:35.350-04:00  WARN 58909 --- [           main] o.h.t.s.i.ExceptionHandlerLoggedImpl     : GenerationTarget encountered exception accepting command : Error executing DDL "
    insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement

org.hibernate.tool.schema.spi.CommandAcceptanceException: Error executing DDL "
    insert into hibernate_sequences(sequence_name, next_val) values ('default',0)" via JDBC Statement
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:67) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.applySqlString(AbstractSchemaMigrator.java:587) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.applySqlStrings(AbstractSchemaMigrator.java:532) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.createTable(AbstractSchemaMigrator.java:307) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.internal.GroupedSchemaMigratorImpl.performTablesMigration(GroupedSchemaMigratorImpl.java:79) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.performMigration(AbstractSchemaMigrator.java:225) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.internal.AbstractSchemaMigrator.doMigration(AbstractSchemaMigrator.java:126) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:284) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.lambda$process$5(SchemaManagementToolCoordinator.java:143) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at java.base/java.util.HashMap.forEach(HashMap.java:1421) ~[na:na]
        at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:140) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:336) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:415) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1423) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:66) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:376) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:352) ~[spring-orm-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1808) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1758) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:599) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:521) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.6.jar:6.0.6]
        at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1132) ~[spring-context-6.0.6.jar:6.0.6]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:907) ~[spring-context-6.0.6.jar:6.0.6]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:584) ~[spring-context-6.0.6.jar:6.0.6]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:732) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:434) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:310) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1304) ~[spring-boot-3.0.4.jar:3.0.4]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1293) ~[spring-boot-3.0.4.jar:3.0.4]
        at ashburncode.prezinfosb.PrezinfosbApplication.main(PrezinfosbApplication.java:22) ~[main/:na]
Caused by: java.sql.SQLIntegrityConstraintViolationException: Duplicate entry 'default' for key 'hibernate_sequences.PRIMARY'
        at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:117) ~[mysql-connector-j-8.0.32.jar:8.0.32]
        at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:122) ~[mysql-connector-j-8.0.32.jar:8.0.32]
        at com.mysql.cj.jdbc.StatementImpl.executeInternal(StatementImpl.java:763) ~[mysql-connector-j-8.0.32.jar:8.0.32]
        at com.mysql.cj.jdbc.StatementImpl.execute(StatementImpl.java:648) ~[mysql-connector-j-8.0.32.jar:8.0.32]
        at com.zaxxer.hikari.pool.ProxyStatement.execute(ProxyStatement.java:94) ~[HikariCP-5.0.1.jar:na]
        at com.zaxxer.hikari.pool.HikariProxyStatement.execute(HikariProxyStatement.java) ~[HikariCP-5.0.1.jar:na]
        at org.hibernate.tool.schema.internal.exec.GenerationTargetToDatabase.accept(GenerationTargetToDatabase.java:54) ~[hibernate-core-6.1.7.Final.jar:6.1.7.Final]
        ... 36 common frames omitted

2023-04-20T07:28:35.422-04:00  INFO 58909 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2023-04-20T07:28:35.427-04:00  INFO 58909 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2023-04-20T07:28:35.628-04:00  WARN 58909 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2023-04-20T07:28:35.968-04:00  INFO 58909 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 14 endpoint(s) beneath base path '/actuator'
2023-04-20T07:28:36.003-04:00  INFO 58909 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-04-20T07:28:36.011-04:00  INFO 58909 --- [           main] a.prezinfosb.PrezinfosbApplication       : Started PrezinfosbApplication in 2.458 seconds (process running for 2.627)
<==========---> 80% EXECUTING [6m 25s]
> :bootRun
^Cdavidho@dphxps17:~/sbootprojs/prezinfosb$ 
davidho@dphxps17:~/sbootprojs/prezinfosb$ 

```
