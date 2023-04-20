# @GeneratedValue(strategy = GenerationType.AUTO)

[return to README.md](/README.md)

```
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
```

```
use prezdbsb;
show tables;
desc president;
desc election;
desc term;
desc president_seq;
desc election_seq;
desc term_seq;
select id, created_at, first_name, last_name, middle_name, political_party from president;
select id, created_at, president_id, election_date, incumb_won_election from election;
select id, created_at, president_id, beg_date, end_date from term;
select * from president_seq;
select * from election_seq;
select * from term_seq;
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
| election_seq       |
| president          |
| president_seq      |
| term               |
| term_seq           |
+--------------------+
6 rows in set (0.00 sec)

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

mysql> desc president_seq;
+----------+--------+------+-----+---------+-------+
| Field    | Type   | Null | Key | Default | Extra |
+----------+--------+------+-----+---------+-------+
| next_val | bigint | YES  |     | NULL    |       |
+----------+--------+------+-----+---------+-------+
1 row in set (0.00 sec)

mysql> desc election_seq;
+----------+--------+------+-----+---------+-------+
| Field    | Type   | Null | Key | Default | Extra |
+----------+--------+------+-----+---------+-------+
| next_val | bigint | YES  |     | NULL    |       |
+----------+--------+------+-----+---------+-------+
1 row in set (0.01 sec)

mysql> desc term_seq;
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
|  1 | 2023-04-20 07:02:20.553000 | George     | Washington |             | Unaffiliated          |
|  2 | 2023-04-20 07:02:20.575000 | John       | Adams      |             | Federalist            |
|  3 | 2023-04-20 07:02:20.581000 | Thomas     | Jefferson  |             | Democratic-Republican |
|  4 | 2023-04-20 07:02:20.583000 | James      | Madison    |             | Democratic-Republican |
|  5 | 2023-04-20 07:02:20.587000 | James      | Monroe     |             | Democratic-Republican |
|  6 | 2023-04-20 07:02:20.589000 | John       | Adams      | Quincy      | Democratic-Republican |
|  7 | 2023-04-20 07:02:20.592000 | Andrew     | Jackson    |             | Democratic            |
|  8 | 2023-04-20 07:02:20.595000 | Martin     | Van Buren  |             | Democratic            |
|  9 | 2023-04-20 07:02:20.597000 | William    | Harrison   | Henry       | Whig                  |
| 10 | 2023-04-20 07:02:20.599000 | John       | Tyler      |             | Whig                  |
| 11 | 2023-04-20 07:02:20.602000 | James      | Polk       | K           | Democratic            |
| 12 | 2023-04-20 07:02:20.605000 | Zachary    | Taylor     |             | Whig                  |
| 13 | 2023-04-20 07:02:20.607000 | Millard    | Fillmore   |             | Whig                  |
| 14 | 2023-04-20 07:02:20.610000 | Franklin   | Pierce     |             | Democratic            |
| 15 | 2023-04-20 07:02:20.613000 | James      | Buchanan   |             | Democratic            |
| 16 | 2023-04-20 07:02:20.617000 | Abraham    | Lincoln    |             | Republican            |
| 17 | 2023-04-20 07:02:20.621000 | Andrew     | Johnson    |             | Democratic            |
| 18 | 2023-04-20 07:02:20.624000 | Ulysses    | Grant      | S.          | Republican            |
| 19 | 2023-04-20 07:02:20.627000 | Rutherford | Hayes      | B.          | Republican            |
| 20 | 2023-04-20 07:02:20.629000 | James      | Garfield   | A.          | Republican            |
| 21 | 2023-04-20 07:02:20.632000 | Chester    | Arthur     | A.          | Republican            |
| 22 | 2023-04-20 07:02:20.634000 | Grover     | Cleveland  |             | Democratic            |
| 23 | 2023-04-20 07:02:20.637000 | Benjamin   | Harrison   |             | Republican            |
| 24 | 2023-04-20 07:02:20.639000 | William    | McKinley   |             | Republican            |
| 25 | 2023-04-20 07:02:20.642000 | Theodore   | Roosevelt  |             | Republican            |
| 26 | 2023-04-20 07:02:20.645000 | William    | Taft       | Howard      | Republican            |
| 27 | 2023-04-20 07:02:20.647000 | Woodrow    | Wilson     |             | Democratic            |
| 28 | 2023-04-20 07:02:20.650000 | Warren     | Harding    | G.          | Republican            |
| 29 | 2023-04-20 07:02:20.652000 | Calvin     | Coolidge   |             | Republican            |
| 30 | 2023-04-20 07:02:20.655000 | Herbert    | Hoover     |             | Republican            |
| 31 | 2023-04-20 07:02:20.657000 | Franklin   | Roosevelt  | D.          | Democratic            |
| 32 | 2023-04-20 07:02:20.660000 | Harry      | Truman     | S.          | Democratic            |
| 33 | 2023-04-20 07:02:20.662000 | Dwight     | Eisenhower | D.          | Republican            |
| 34 | 2023-04-20 07:02:20.665000 | John       | Kennedy    | F.          | Democratic            |
| 35 | 2023-04-20 07:02:20.668000 | Lyndon     | Johnson    | B.          | Democratic            |
| 36 | 2023-04-20 07:02:20.670000 | Richard    | Nixon      |             | Republican            |
| 37 | 2023-04-20 07:02:20.673000 | Gerald     | Ford       |             | Republican            |
| 38 | 2023-04-20 07:02:20.675000 | Jimmy      | Carter     |             | Democratic            |
| 39 | 2023-04-20 07:02:20.678000 | Ronald     | Reagan     |             | Republican            |
| 40 | 2023-04-20 07:02:20.699000 | George     | Bush       | H. W.       | Republican            |
| 41 | 2023-04-20 07:02:20.701000 | Bill       | Clinton    |             | Democratic            |
| 42 | 2023-04-20 07:02:20.704000 | George     | Bush       | W.          | Republican            |
| 43 | 2023-04-20 07:02:20.706000 | Barack     | Obama      |             | Democratic            |
| 44 | 2023-04-20 07:02:20.709000 | Donald     | Trump      |             | Republican            |
| 45 | 2023-04-20 07:02:20.711000 | Joe        | Biden      |             | Democratic            |
+----+----------------------------+------------+------------+-------------+-----------------------+
45 rows in set (0.00 sec)

mysql> select id, created_at, president_id, election_date, incumb_won_election from election;
+----+----------------------------+--------------+----------------------------+------------------------------------------+
| id | created_at                 | president_id | election_date              | incumb_won_election                      |
+----+----------------------------+--------------+----------------------------+------------------------------------------+
|  1 | 2023-04-20 07:02:20.678000 |           39 | 1980-11-04 00:00:00.000000 | 0x00                                     |
|  2 | 2023-04-20 07:02:20.678000 |           39 | 1984-11-06 00:00:00.000000 | 0x01                                     |
+----+----------------------------+--------------+----------------------------+------------------------------------------+
2 rows in set (0.00 sec)

mysql> select id, created_at, president_id, beg_date, end_date from term;
+----+----------------------------+--------------+----------------------------+----------------------------+
| id | created_at                 | president_id | beg_date                   | end_date                   |
+----+----------------------------+--------------+----------------------------+----------------------------+
|  1 | 2023-04-20 07:02:20.678000 |           39 | 1981-01-20 00:00:00.000000 | 1985-01-20 00:00:00.000000 |
|  2 | 2023-04-20 07:02:20.678000 |           39 | 1985-01-20 00:00:00.000000 | 1989-01-20 00:00:00.000000 |
+----+----------------------------+--------------+----------------------------+----------------------------+
2 rows in set (0.00 sec)

mysql> select * from president_seq;
+----------+
| next_val |
+----------+
|      101 |
+----------+
1 row in set (0.00 sec)

mysql> select * from election_seq;
+----------+
| next_val |
+----------+
|      101 |
+----------+
1 row in set (0.00 sec)

mysql> select * from term_seq;
+----------+
| next_val |
+----------+
|      101 |
+----------+
1 row in set (0.00 sec)

mysql> 
```
