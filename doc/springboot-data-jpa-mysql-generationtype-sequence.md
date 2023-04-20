# @GeneratedValue(strategy = GenerationType.SEQUENCE)

[return to README.md](/README.md)

```
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
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
9 rows in set (0.01 sec)

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
1 row in set (0.00 sec)

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
|  1 | 2023-04-20 07:23:17.782000 | George     | Washington |             | Unaffiliated          |
|  2 | 2023-04-20 07:23:17.805000 | John       | Adams      |             | Federalist            |
|  3 | 2023-04-20 07:23:17.812000 | Thomas     | Jefferson  |             | Democratic-Republican |
|  4 | 2023-04-20 07:23:17.815000 | James      | Madison    |             | Democratic-Republican |
|  5 | 2023-04-20 07:23:17.817000 | James      | Monroe     |             | Democratic-Republican |
|  6 | 2023-04-20 07:23:17.820000 | John       | Adams      | Quincy      | Democratic-Republican |
|  7 | 2023-04-20 07:23:17.823000 | Andrew     | Jackson    |             | Democratic            |
|  8 | 2023-04-20 07:23:17.825000 | Martin     | Van Buren  |             | Democratic            |
|  9 | 2023-04-20 07:23:17.828000 | William    | Harrison   | Henry       | Whig                  |
| 10 | 2023-04-20 07:23:17.830000 | John       | Tyler      |             | Whig                  |
| 11 | 2023-04-20 07:23:17.833000 | James      | Polk       | K           | Democratic            |
| 12 | 2023-04-20 07:23:17.835000 | Zachary    | Taylor     |             | Whig                  |
| 13 | 2023-04-20 07:23:17.837000 | Millard    | Fillmore   |             | Whig                  |
| 14 | 2023-04-20 07:23:17.840000 | Franklin   | Pierce     |             | Democratic            |
| 15 | 2023-04-20 07:23:17.842000 | James      | Buchanan   |             | Democratic            |
| 16 | 2023-04-20 07:23:17.844000 | Abraham    | Lincoln    |             | Republican            |
| 17 | 2023-04-20 07:23:17.847000 | Andrew     | Johnson    |             | Democratic            |
| 18 | 2023-04-20 07:23:17.849000 | Ulysses    | Grant      | S.          | Republican            |
| 19 | 2023-04-20 07:23:17.851000 | Rutherford | Hayes      | B.          | Republican            |
| 20 | 2023-04-20 07:23:17.853000 | James      | Garfield   | A.          | Republican            |
| 21 | 2023-04-20 07:23:17.856000 | Chester    | Arthur     | A.          | Republican            |
| 22 | 2023-04-20 07:23:17.858000 | Grover     | Cleveland  |             | Democratic            |
| 23 | 2023-04-20 07:23:17.860000 | Benjamin   | Harrison   |             | Republican            |
| 24 | 2023-04-20 07:23:17.862000 | William    | McKinley   |             | Republican            |
| 25 | 2023-04-20 07:23:17.865000 | Theodore   | Roosevelt  |             | Republican            |
| 26 | 2023-04-20 07:23:17.867000 | William    | Taft       | Howard      | Republican            |
| 27 | 2023-04-20 07:23:17.870000 | Woodrow    | Wilson     |             | Democratic            |
| 28 | 2023-04-20 07:23:17.872000 | Warren     | Harding    | G.          | Republican            |
| 29 | 2023-04-20 07:23:17.874000 | Calvin     | Coolidge   |             | Republican            |
| 30 | 2023-04-20 07:23:17.876000 | Herbert    | Hoover     |             | Republican            |
| 31 | 2023-04-20 07:23:17.878000 | Franklin   | Roosevelt  | D.          | Democratic            |
| 32 | 2023-04-20 07:23:17.881000 | Harry      | Truman     | S.          | Democratic            |
| 33 | 2023-04-20 07:23:17.883000 | Dwight     | Eisenhower | D.          | Republican            |
| 34 | 2023-04-20 07:23:17.886000 | John       | Kennedy    | F.          | Democratic            |
| 35 | 2023-04-20 07:23:17.889000 | Lyndon     | Johnson    | B.          | Democratic            |
| 36 | 2023-04-20 07:23:17.893000 | Richard    | Nixon      |             | Republican            |
| 37 | 2023-04-20 07:23:17.895000 | Gerald     | Ford       |             | Republican            |
| 38 | 2023-04-20 07:23:17.898000 | Jimmy      | Carter     |             | Democratic            |
| 39 | 2023-04-20 07:23:17.900000 | Ronald     | Reagan     |             | Republican            |
| 40 | 2023-04-20 07:23:17.919000 | George     | Bush       | H. W.       | Republican            |
| 41 | 2023-04-20 07:23:17.921000 | Bill       | Clinton    |             | Democratic            |
| 42 | 2023-04-20 07:23:17.923000 | George     | Bush       | W.          | Republican            |
| 43 | 2023-04-20 07:23:17.925000 | Barack     | Obama      |             | Democratic            |
| 44 | 2023-04-20 07:23:17.926000 | Donald     | Trump      |             | Republican            |
| 45 | 2023-04-20 07:23:17.928000 | Joe        | Biden      |             | Democratic            |
+----+----------------------------+------------+------------+-------------+-----------------------+
45 rows in set (0.00 sec)

mysql> select id, created_at, president_id, election_date, incumb_won_election from election;
+----+----------------------------+--------------+----------------------------+------------------------------------------+
| id | created_at                 | president_id | election_date              | incumb_won_election                      |
+----+----------------------------+--------------+----------------------------+------------------------------------------+
|  1 | 2023-04-20 07:23:17.900000 |           39 | 1980-11-04 00:00:00.000000 | 0x00                                     |
|  2 | 2023-04-20 07:23:17.900000 |           39 | 1984-11-06 00:00:00.000000 | 0x01                                     |
+----+----------------------------+--------------+----------------------------+------------------------------------------+
2 rows in set (0.00 sec)

mysql> select id, created_at, president_id, beg_date, end_date from term;
+----+----------------------------+--------------+----------------------------+----------------------------+
| id | created_at                 | president_id | beg_date                   | end_date                   |
+----+----------------------------+--------------+----------------------------+----------------------------+
|  1 | 2023-04-20 07:23:17.900000 |           39 | 1981-01-20 00:00:00.000000 | 1985-01-20 00:00:00.000000 |
|  2 | 2023-04-20 07:23:17.900000 |           39 | 1985-01-20 00:00:00.000000 | 1989-01-20 00:00:00.000000 |
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

