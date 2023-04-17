# @GeneratedValue(strategy = GenerationType.AUTO)

[return to README.md](/README.md)

```
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
```

```
mysql> use prezdbsb;
Database changed
mysql> 
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

mysql> desc president_seq;
+----------+--------+------+-----+---------+-------+
| Field    | Type   | Null | Key | Default | Extra |
+----------+--------+------+-----+---------+-------+
| next_val | bigint | YES  |     | NULL    |       |
+----------+--------+------+-----+---------+-------+
1 row in set (0.00 sec)

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
17 rows in set (0.01 sec)

mysql> desc election_seq;
+----------+--------+------+-----+---------+-------+
| Field    | Type   | Null | Key | Default | Extra |
+----------+--------+------+-----+---------+-------+
| next_val | bigint | YES  |     | NULL    |       |
+----------+--------+------+-----+---------+-------+
1 row in set (0.00 sec)

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

mysql> desc term_seq;
+----------+--------+------+-----+---------+-------+
| Field    | Type   | Null | Key | Default | Extra |
+----------+--------+------+-----+---------+-------+
| next_val | bigint | YES  |     | NULL    |       |
+----------+--------+------+-----+---------+-------+
1 row in set (0.00 sec)

mysql> select * from president;
+----+----------------------------+---------------------+------------------+------------+------------+-------------+-------------+-----------------------+
| id | created_at                 | first_inaug_address | first_inaug_date | first_name | last_name  | middle_name | modified_at | political_party       |
+----+----------------------------+---------------------+------------------+------------+------------+-------------+-------------+-----------------------+
|  1 | 2023-04-17 07:42:51.776000 | NULL                | NULL             | George     | Washington |             | NULL        | Unaffiliated          |
|  2 | 2023-04-17 07:42:51.813000 | NULL                | NULL             | John       | Adams      |             | NULL        | Federalist            |
|  3 | 2023-04-17 07:42:51.820000 | NULL                | NULL             | Thomas     | Jefferson  |             | NULL        | Democratic-Republican |
|  4 | 2023-04-17 07:42:51.822000 | NULL                | NULL             | James      | Madison    |             | NULL        | Democratic-Republican |
|  5 | 2023-04-17 07:42:51.825000 | NULL                | NULL             | James      | Monroe     |             | NULL        | Democratic-Republican |
|  6 | 2023-04-17 07:42:51.827000 | NULL                | NULL             | John       | Adams      | Quincy      | NULL        | Democratic-Republican |
|  7 | 2023-04-17 07:42:51.830000 | NULL                | NULL             | Andrew     | Jackson    |             | NULL        | Democratic            |
|  8 | 2023-04-17 07:42:51.833000 | NULL                | NULL             | Martin     | Van Buren  |             | NULL        | Democratic            |
|  9 | 2023-04-17 07:42:51.835000 | NULL                | NULL             | William    | Harrison   | Henry       | NULL        | Whig                  |
| 10 | 2023-04-17 07:42:51.838000 | NULL                | NULL             | John       | Tyler      |             | NULL        | Whig                  |
| 11 | 2023-04-17 07:42:51.840000 | NULL                | NULL             | James      | Polk       | K           | NULL        | Democratic            |
| 12 | 2023-04-17 07:42:51.842000 | NULL                | NULL             | Zachary    | Taylor     |             | NULL        | Whig                  |
| 13 | 2023-04-17 07:42:51.845000 | NULL                | NULL             | Millard    | Fillmore   |             | NULL        | Whig                  |
| 14 | 2023-04-17 07:42:51.847000 | NULL                | NULL             | Franklin   | Pierce     |             | NULL        | Democratic            |
| 15 | 2023-04-17 07:42:51.850000 | NULL                | NULL             | James      | Buchanan   |             | NULL        | Democratic            |
| 16 | 2023-04-17 07:42:51.852000 | NULL                | NULL             | Abraham    | Lincoln    |             | NULL        | Republican            |
| 17 | 2023-04-17 07:42:51.855000 | NULL                | NULL             | Andrew     | Johnson    |             | NULL        | Democratic            |
| 18 | 2023-04-17 07:42:51.858000 | NULL                | NULL             | Ulysses    | Grant      | S.          | NULL        | Republican            |
| 19 | 2023-04-17 07:42:51.861000 | NULL                | NULL             | Rutherford | Hayes      | B.          | NULL        | Republican            |
| 20 | 2023-04-17 07:42:51.863000 | NULL                | NULL             | James      | Garfield   | A.          | NULL        | Republican            |
| 21 | 2023-04-17 07:42:51.866000 | NULL                | NULL             | Chester    | Arthur     | A.          | NULL        | Republican            |
| 22 | 2023-04-17 07:42:51.868000 | NULL                | NULL             | Grover     | Cleveland  |             | NULL        | Democratic            |
| 23 | 2023-04-17 07:42:51.870000 | NULL                | NULL             | Benjamin   | Harrison   |             | NULL        | Republican            |
| 24 | 2023-04-17 07:42:51.873000 | NULL                | NULL             | William    | McKinley   |             | NULL        | Republican            |
| 25 | 2023-04-17 07:42:51.875000 | NULL                | NULL             | Theodore   | Roosevelt  |             | NULL        | Republican            |
| 26 | 2023-04-17 07:42:51.877000 | NULL                | NULL             | William    | Taft       | Howard      | NULL        | Republican            |
| 27 | 2023-04-17 07:42:51.879000 | NULL                | NULL             | Woodrow    | Wilson     |             | NULL        | Democratic            |
| 28 | 2023-04-17 07:42:51.882000 | NULL                | NULL             | Warren     | Harding    | G.          | NULL        | Republican            |
| 29 | 2023-04-17 07:42:51.886000 | NULL                | NULL             | Calvin     | Coolidge   |             | NULL        | Republican            |
| 30 | 2023-04-17 07:42:51.891000 | NULL                | NULL             | Herbert    | Hoover     |             | NULL        | Republican            |
| 31 | 2023-04-17 07:42:51.895000 | NULL                | NULL             | Franklin   | Roosevelt  | D.          | NULL        | Democratic            |
| 32 | 2023-04-17 07:42:51.898000 | NULL                | NULL             | Harry      | Truman     | S.          | NULL        | Democratic            |
| 33 | 2023-04-17 07:42:51.902000 | NULL                | NULL             | Dwight     | Eisenhower | D.          | NULL        | Republican            |
| 34 | 2023-04-17 07:42:51.906000 | NULL                | NULL             | John       | Kennedy    | F.          | NULL        | Democratic            |
| 35 | 2023-04-17 07:42:51.909000 | NULL                | NULL             | Lyndon     | Johnson    | B.          | NULL        | Democratic            |
| 36 | 2023-04-17 07:42:51.912000 | NULL                | NULL             | Richard    | Nixon      |             | NULL        | Republican            |
| 37 | 2023-04-17 07:42:51.919000 | NULL                | NULL             | Gerald     | Ford       |             | NULL        | Republican            |
| 38 | 2023-04-17 07:42:51.922000 | NULL                | NULL             | Jimmy      | Carter     |             | NULL        | Democratic            |
| 39 | 2023-04-17 07:42:51.924000 | NULL                | NULL             | Ronald     | Reagan     |             | NULL        | Republican            |
| 40 | 2023-04-17 07:42:51.954000 | NULL                | NULL             | George     | Bush       | H. W.       | NULL        | Republican            |
| 41 | 2023-04-17 07:42:51.956000 | NULL                | NULL             | Bill       | Clinton    |             | NULL        | Democratic            |
| 42 | 2023-04-17 07:42:51.958000 | NULL                | NULL             | George     | Bush       | W.          | NULL        | Republican            |
| 43 | 2023-04-17 07:42:51.961000 | NULL                | NULL             | Barack     | Obama      |             | NULL        | Democratic            |
| 44 | 2023-04-17 07:42:51.963000 | NULL                | NULL             | Donald     | Trump      |             | NULL        | Republican            |
| 45 | 2023-04-17 07:42:51.965000 | NULL                | NULL             | Joe        | Biden      |             | NULL        | Democratic            |
+----+----------------------------+---------------------+------------------+------------+------------+-------------+-------------+-----------------------+
45 rows in set (0.00 sec)

mysql> select * from term;
+----+----------------------------+----------------------------+----------------------------+-------------+--------------+
| id | beg_date                   | created_at                 | end_date                   | modified_at | president_id |
+----+----------------------------+----------------------------+----------------------------+-------------+--------------+
|  1 | 1981-01-20 00:00:00.000000 | 2023-04-17 07:42:51.925000 | 1985-01-20 00:00:00.000000 | NULL        |           39 |
|  2 | 1985-01-20 00:00:00.000000 | 2023-04-17 07:42:51.925000 | 1989-01-20 00:00:00.000000 | NULL        |           39 |
+----+----------------------------+----------------------------+----------------------------+-------------+--------------+
2 rows in set (0.00 sec)

mysql> select * from term;
+----+----------------------------+----------------------------+----------------------------+-------------+--------------+
| id | beg_date                   | created_at                 | end_date                   | modified_at | president_id |
+----+----------------------------+----------------------------+----------------------------+-------------+--------------+
|  1 | 1981-01-20 00:00:00.000000 | 2023-04-17 07:42:51.925000 | 1985-01-20 00:00:00.000000 | NULL        |           39 |
|  2 | 1985-01-20 00:00:00.000000 | 2023-04-17 07:42:51.925000 | 1989-01-20 00:00:00.000000 | NULL        |           39 |
+----+----------------------------+----------------------------+----------------------------+-------------+--------------+
2 rows in set (0.00 sec)

mysql> select id, president_id, created_at, incumb_won_election, election_date, winner_electoral_vote, winner_popular_vote, total_popular_vote from election;
+----+--------------+----------------------------+------------------------------------------+----------------------------+-----------------------+---------------------+--------------------+
| id | president_id | created_at                 | incumb_won_election                      | election_date              | winner_electoral_vote | winner_popular_vote | total_popular_vote |
+----+--------------+----------------------------+------------------------------------------+----------------------------+-----------------------+---------------------+--------------------+
|  1 |           39 | 2023-04-17 07:42:51.925000 | 0x00                                     | 1980-11-04 00:00:00.000000 |                   489 |            43903230 |           86509678 |
|  2 |           39 | 2023-04-17 07:42:51.925000 | 0x01                                     | 1984-11-06 00:00:00.000000 |                   525 |            54455472 |           92653233 |
+----+--------------+----------------------------+------------------------------------------+----------------------------+-----------------------+---------------------+--------------------+
2 rows in set (0.00 sec)

mysql> 
```
