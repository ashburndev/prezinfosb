I converted my prezinfosb Spring Boot 3.0.4 web application from MySQL to Postgress.  I allowed the application to create the database.

    /home/davidho/sbootprojs/prezinfosb/build.gradle
      // runtimeOnly 'com.mysql:mysql-connector-j'
      runtimeOnly 'org.postgresql:postgresql'

    /home/davidho/sbootprojs/prezinfosb/src/main/resources/application.properties
      # https://www.bezkoder.com/spring-boot-postgresql-example/
      spring.datasource.url= jdbc:postgresql://localhost:5432/sammy
      spring.datasource.username= sammy
      spring.datasource.password= sammyP@$$
      spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation= true
      spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.PostgreSQLDialect
      spring.jpa.hibernate.ddl-auto=update

      server.tomcat.accesslog.enabled=true
      server.tomcat.accesslog.suffix=.log
      server.tomcat.accesslog.prefix=access_log
      server.tomcat.accesslog.file-date-format=.yyyy-MM-dd
      server.tomcat.basedir=tomcat
      server.tomcat.accesslog.directory=logs
      server.tomcat.accesslog.pattern=common

      management.endpoints.web.exposure.include=*
      spring.data.rest.base-path=/data-api


    postgres@dphxps17:~$ psql
    psql (14.7 (Ubuntu 14.7-0ubuntu0.22.04.1))
    Type "help" for help.

    postgres=# \list
                                      List of databases
      Name    |  Owner   | Encoding |   Collate   |    Ctype    |   Access privileges   
    -----------+----------+----------+-------------+-------------+-----------------------
    postgres  | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
    sammy     | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | 
    template0 | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/postgres          +
              |          |          |             |             | postgres=CTc/postgres
    template1 | postgres | UTF8     | en_US.UTF-8 | en_US.UTF-8 | =c/postgres          +
              |          |          |             |             | postgres=CTc/postgres
    (4 rows)

    postgres=# \c sammy
    You are now connected to database "sammy" as user "postgres".
    sammy=# \dt
    Did not find any relations.
    sammy=# 
    sammy=# \conninfo
    You are connected to database "sammy" as user "postgres" via socket in "/var/run/postgresql" at port "5432".
    sammy=# 
    sammy=# \dt
            List of relations
    Schema |   Name    | Type  | Owner 
    --------+-----------+-------+-------
    public | election  | table | sammy
    public | president | table | sammy
    public | term      | table | sammy
    (3 rows)

    sammy=# select * from president;
    id | first_inaug_address | first_inaug_date | first_name | last_name  | middle_name |    political_party    
    ----+---------------------+------------------+------------+------------+-------------+-----------------------
      1 |                     |                  | George     | Washington |             | Unaffiliated
      2 |                     |                  | John       | Adams      |             | Federalist
      3 |                     |                  | Thomas     | Jefferson  |             | Democratic-Republican
      4 |                     |                  | Abraham    | Lincoln    |             | Republican
      5 |                     |                  | Theodore   | Roosevelt  |             | Republican
      6 |                     |                  | William    | Taft       | Howard      | Republican
      7 |                     |                  | Woodrow    | Wilson     |             | Democratic
      8 |                     |                  | Warren     | Harding    | G.          | Republican
      9 |                     |                  | Calvin     | Coolidge   |             | Republican
    10 |                     |                  | Herbert    | Hoover     |             | Republican
    11 |                     |                  | Franklin   | Roosevelt  | D.          | Democratic
    12 |                     |                  | Harry      | Truman     | S.          | Democratic
    13 |                     |                  | Dwight     | Eisenhower | D.          | Republican
    14 |                     |                  | John       | Kennedy    | F.          | Democratic
    15 |                     |                  | Lyndon     | Johnson    | B.          | Democratic
    16 |                     |                  | Richard    | Nixon      |             | Republican
    17 |                     |                  | Gerald     | Ford       |             | Republican
    18 |                     |                  | Jimmy      | Carter     |             | Democratic
    19 |                     |                  | Ronald     | Reagan     |             | Republican
    20 |                     |                  | George     | Bush       | H. W.       | Republican
    21 |                     |                  | Bill       | Clinton    |             | Democratic
    22 |                     |                  | George     | Bush       | W.          | Republican
    23 |                     |                  | Barack     | Obama      |             | Democratic
    24 |                     |                  | Donald     | Trump      |             | Republican
    25 |                     |                  | Joe        | Biden      |             | Democratic
    (25 rows)

    sammy=# 
    sammy=# select * from term;
    id |      beg_date       |      end_date       | president_id 
    ----+---------------------+---------------------+--------------
      1 | 1981-01-20 00:00:00 | 1985-01-20 00:00:00 |           19
      2 | 1985-01-20 00:00:00 | 1989-01-20 00:00:00 |           19
    (2 rows)

    sammy=# select * from election;
    sammy=# 
    sammy=# select id, president_id, election_date, incumb_won_election, winner_electoral_vote, winner_popular_vote, total_electoral_vote, total_popular_vote from election;
    id | president_id |    election_date    | incumb_won_election | winner_electoral_vote | winner_popular_vote | total_electoral_vote | total_popular_vote 
    ----+--------------+---------------------+---------------------+-----------------------+---------------------+----------------------+--------------------
      1 |           19 | 1980-11-04 00:00:00 | f                   |                   489 |            43903230 |                  538 |           86509678
      2 |           19 | 1984-11-06 00:00:00 | t                   |                   525 |            54455472 |                  538 |           92653233
    (2 rows)

    sammy=# 

The application responds to (curl) http requests as it did previously when using MySQL

    davidho@dphxps17:~$ history | tail
    1999  cd ~/repositories/miscdphxps17u22/
    2000  git status
    2001  curl localhost:8080/api
    2002  curl localhost:8080/data-api
    2003  curl localhost:8080/api/presidents/18 | jq
    2004  curl localhost:8080/api/presidents/19 | jq
    2005  curl http://localhost:8080/data-api/presidents/19
    2006  curl 'http://localhost:8080/data-api/presidents?page=0&size=3'
    2007  history
    2008  history | tail
    davidho@dphxps17:~$ 

    /home/davidho/sbootprojs/prezinfosb/tomcat/logs/access_log.2023-04-13.log
    127.0.0.1 - - [13/Apr/2023:06:21:17 -0400] "GET /api HTTP/1.1" 404 103
    127.0.0.1 - - [13/Apr/2023:06:21:38 -0400] "GET /data-api HTTP/1.1" 200 492
    127.0.0.1 - - [13/Apr/2023:06:22:27 -0400] "GET /api/presidents/18 HTTP/1.1" 200 179
    127.0.0.1 - - [13/Apr/2023:06:22:53 -0400] "GET /api/presidents/19 HTTP/1.1" 200 992
    127.0.0.1 - - [13/Apr/2023:06:23:59 -0400] "GET /data-api/presidents/19 HTTP/1.1" 200 560
    127.0.0.1 - - [13/Apr/2023:06:24:39 -0400] "GET /data-api/presidents?page=0&size=3 HTTP/1.1" 200 2557

