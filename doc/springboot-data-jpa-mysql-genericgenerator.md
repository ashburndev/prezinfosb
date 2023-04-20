#  @GenericGenerator(name = "hibernate_sequence", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",

[return to README.md](/README.md)

```
@Id
@GeneratedValue(generator = "hibernate_sequence")
@GenericGenerator(name = "hibernate_sequence", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
  @Parameter(name = "sequence_name", value = "hibernate_sequence"), @Parameter(name = "initial_value", value = "1"),
  @Parameter(name = "increment_size", value = "1") })
private Long id;
```

```
use prezdbsb;
show tables;
desc president;
desc election;
desc term;
desc hibernate_sequence;
select id, created_at, first_name, last_name, middle_name, political_party from president;
select id, created_at, president_id, election_date, incumb_won_election from election;
select id, created_at, president_id, beg_date, end_date from term;
select * from hibernate_sequence;
```

```
mysql> 
mysql> use prezdbsb;
Database changed
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

mysql> desc hibernate_sequence;
+----------+--------+------+-----+---------+-------+
| Field    | Type   | Null | Key | Default | Extra |
+----------+--------+------+-----+---------+-------+
| next_val | bigint | YES  |     | NULL    |       |
+----------+--------+------+-----+---------+-------+
1 row in set (0.00 sec)

mysql> select id, created_at, first_name, last_name, middle_name, political_party from president;
+----+----------------------------+------------+------------+-------------+-----------------------+
| id | created_at                 | first_name | last_name  | middle_name | political_party       |
+----+----------------------------+------------+------------+-------------+-----------------------+
|  1 | 2023-04-20 07:58:17.724000 | George     | Washington |             | Unaffiliated          |
|  2 | 2023-04-20 07:58:17.751000 | John       | Adams      |             | Federalist            |
|  3 | 2023-04-20 07:58:17.757000 | Thomas     | Jefferson  |             | Democratic-Republican |
|  4 | 2023-04-20 07:58:17.763000 | James      | Madison    |             | Democratic-Republican |
|  5 | 2023-04-20 07:58:17.767000 | James      | Monroe     |             | Democratic-Republican |
|  6 | 2023-04-20 07:58:17.772000 | John       | Adams      | Quincy      | Democratic-Republican |
|  7 | 2023-04-20 07:58:17.777000 | Andrew     | Jackson    |             | Democratic            |
|  8 | 2023-04-20 07:58:17.784000 | Martin     | Van Buren  |             | Democratic            |
|  9 | 2023-04-20 07:58:17.790000 | William    | Harrison   | Henry       | Whig                  |
| 10 | 2023-04-20 07:58:17.794000 | John       | Tyler      |             | Whig                  |
| 11 | 2023-04-20 07:58:17.798000 | James      | Polk       | K           | Democratic            |
| 12 | 2023-04-20 07:58:17.804000 | Zachary    | Taylor     |             | Whig                  |
| 13 | 2023-04-20 07:58:17.809000 | Millard    | Fillmore   |             | Whig                  |
| 14 | 2023-04-20 07:58:17.815000 | Franklin   | Pierce     |             | Democratic            |
| 15 | 2023-04-20 07:58:17.820000 | James      | Buchanan   |             | Democratic            |
| 16 | 2023-04-20 07:58:17.825000 | Abraham    | Lincoln    |             | Republican            |
| 17 | 2023-04-20 07:58:17.830000 | Andrew     | Johnson    |             | Democratic            |
| 18 | 2023-04-20 07:58:17.834000 | Ulysses    | Grant      | S.          | Republican            |
| 19 | 2023-04-20 07:58:17.838000 | Rutherford | Hayes      | B.          | Republican            |
| 20 | 2023-04-20 07:58:17.843000 | James      | Garfield   | A.          | Republican            |
| 21 | 2023-04-20 07:58:17.846000 | Chester    | Arthur     | A.          | Republican            |
| 22 | 2023-04-20 07:58:17.851000 | Grover     | Cleveland  |             | Democratic            |
| 23 | 2023-04-20 07:58:17.855000 | Benjamin   | Harrison   |             | Republican            |
| 24 | 2023-04-20 07:58:17.860000 | William    | McKinley   |             | Republican            |
| 25 | 2023-04-20 07:58:17.864000 | Theodore   | Roosevelt  |             | Republican            |
| 26 | 2023-04-20 07:58:17.868000 | William    | Taft       | Howard      | Republican            |
| 27 | 2023-04-20 07:58:17.872000 | Woodrow    | Wilson     |             | Democratic            |
| 28 | 2023-04-20 07:58:17.876000 | Warren     | Harding    | G.          | Republican            |
| 29 | 2023-04-20 07:58:17.880000 | Calvin     | Coolidge   |             | Republican            |
| 30 | 2023-04-20 07:58:17.885000 | Herbert    | Hoover     |             | Republican            |
| 31 | 2023-04-20 07:58:17.891000 | Franklin   | Roosevelt  | D.          | Democratic            |
| 32 | 2023-04-20 07:58:17.896000 | Harry      | Truman     | S.          | Democratic            |
| 33 | 2023-04-20 07:58:17.900000 | Dwight     | Eisenhower | D.          | Republican            |
| 34 | 2023-04-20 07:58:17.904000 | John       | Kennedy    | F.          | Democratic            |
| 35 | 2023-04-20 07:58:17.908000 | Lyndon     | Johnson    | B.          | Democratic            |
| 36 | 2023-04-20 07:58:17.912000 | Richard    | Nixon      |             | Republican            |
| 37 | 2023-04-20 07:58:17.916000 | Gerald     | Ford       |             | Republican            |
| 38 | 2023-04-20 07:58:17.919000 | Jimmy      | Carter     |             | Democratic            |
| 39 | 2023-04-20 07:58:17.924000 | Ronald     | Reagan     |             | Republican            |
| 44 | 2023-04-20 07:58:17.945000 | George     | Bush       | H. W.       | Republican            |
| 45 | 2023-04-20 07:58:17.949000 | Bill       | Clinton    |             | Democratic            |
| 46 | 2023-04-20 07:58:17.958000 | George     | Bush       | W.          | Republican            |
| 47 | 2023-04-20 07:58:17.962000 | Barack     | Obama      |             | Democratic            |
| 48 | 2023-04-20 07:58:17.967000 | Donald     | Trump      |             | Republican            |
| 49 | 2023-04-20 07:58:17.971000 | Joe        | Biden      |             | Democratic            |
+----+----------------------------+------------+------------+-------------+-----------------------+
45 rows in set (0.00 sec)

mysql> select id, created_at, president_id, election_date, incumb_won_election from election;
+----+----------------------------+--------------+----------------------------+------------------------------------------+
| id | created_at                 | president_id | election_date              | incumb_won_election                      |
+----+----------------------------+--------------+----------------------------+------------------------------------------+
| 40 | 2023-04-20 07:58:17.924000 |           39 | 1980-11-04 00:00:00.000000 | 0x00                                     |
| 41 | 2023-04-20 07:58:17.924000 |           39 | 1984-11-06 00:00:00.000000 | 0x01                                     |
+----+----------------------------+--------------+----------------------------+------------------------------------------+
2 rows in set (0.00 sec)

mysql> select id, created_at, president_id, beg_date, end_date from term;
+----+----------------------------+--------------+----------------------------+----------------------------+
| id | created_at                 | president_id | beg_date                   | end_date                   |
+----+----------------------------+--------------+----------------------------+----------------------------+
| 42 | 2023-04-20 07:58:17.924000 |           39 | 1981-01-20 00:00:00.000000 | 1985-01-20 00:00:00.000000 |
| 43 | 2023-04-20 07:58:17.924000 |           39 | 1985-01-20 00:00:00.000000 | 1989-01-20 00:00:00.000000 |
+----+----------------------------+--------------+----------------------------+----------------------------+
2 rows in set (0.00 sec)

mysql> select * from hibernate_sequence;
+----------+
| next_val |
+----------+
|       50 |
+----------+
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

2023-04-20T07:58:15.326-04:00  INFO 63697 --- [           main] a.prezinfosb.PrezinfosbApplication       : Starting PrezinfosbApplication using Java 17.0.6 with PID 63697 (/home/davidho/sbootprojs/prezinfosb/build/classes/java/main started by davidho in /home/davidho/sbootprojs/prezinfosb)
2023-04-20T07:58:15.328-04:00  INFO 63697 --- [           main] a.prezinfosb.PrezinfosbApplication       : No active profile set, falling back to 1 default profile: "default"
2023-04-20T07:58:15.708-04:00  INFO 63697 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2023-04-20T07:58:15.735-04:00  INFO 63697 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 22 ms. Found 3 JPA repository interfaces.
2023-04-20T07:58:15.999-04:00  INFO 63697 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2023-04-20T07:58:16.004-04:00  INFO 63697 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-04-20T07:58:16.004-04:00  INFO 63697 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.5]
2023-04-20T07:58:16.046-04:00  INFO 63697 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-04-20T07:58:16.046-04:00  INFO 63697 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 695 ms
2023-04-20T07:58:16.157-04:00  INFO 63697 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2023-04-20T07:58:16.181-04:00  INFO 63697 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.1.7.Final
2023-04-20T07:58:16.297-04:00  INFO 63697 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-04-20T07:58:16.445-04:00  INFO 63697 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@14656be5
2023-04-20T07:58:16.446-04:00  INFO 63697 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2023-04-20T07:58:16.455-04:00  INFO 63697 --- [           main] SQL dialect                              : HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
2023-04-20T07:58:16.456-04:00  WARN 63697 --- [           main] org.hibernate.orm.deprecation            : HHH90000026: MySQL8Dialect has been deprecated; use org.hibernate.dialect.MySQLDialect instead
2023-04-20T07:58:16.998-04:00  INFO 63697 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2023-04-20T07:58:17.003-04:00  INFO 63697 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2023-04-20T07:58:17.198-04:00  WARN 63697 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2023-04-20T07:58:17.530-04:00  INFO 63697 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 14 endpoint(s) beneath base path '/actuator'
2023-04-20T07:58:17.565-04:00  INFO 63697 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2023-04-20T07:58:17.574-04:00  INFO 63697 --- [           main] a.prezinfosb.PrezinfosbApplication       : Started PrezinfosbApplication in 2.423 seconds (process running for 2.563)
<==========---> 80% EXECUTING [27m 12s]
> :bootRun
^Cdavidho@dphxps17:~/sbootprojs/prezinfosb$ 
davidho@dphxps17:~/sbootprojs/prezinfosb$ 
```


