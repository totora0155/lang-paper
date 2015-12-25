# [v10.1.9]
# +------------+
# | Database   |
# +------------+
# | something  |
# | ...        |
create database something;
show databases;

use something;

# [v10.1.9]
# --------------
# mysql  ...
#
# Connection id:		16
# Current database:	test
# Current user:		root@localhost
# SSL:			Not in use
# Current pager:		stdout
# Using outfile:		''
# Using delimiter:	;
# Server:			MariaDB
# Server version:		...
# Protocol version:	10
# Connection:		Localhost via UNIX socket
# Server characterset:	utf8
# Db     characterset:	utf8
# Client characterset:	utf8
# Conn.  characterset:	utf8
# UNIX socket:		/tmp/mysql.sock
# Uptime:			2 days 6 hours 1 min 2 sec
#
# Threads: 1  Questions: 496  Slow queries: 0  Opens: 8  Flush tables: 1  Open tables: 14  Queries per second avg: 0.002
# --------------
\s

# [v10.1.9]
# +---------------------+
# | Tables_in_something |
# +---------------------+
# | table_01            |
# | ...                 |
create table table_01 (id int, name verchar(55));
show tables;

# [v10.1.9]
# +-------+-------------+------+-----+---------+-------+
# | Field | Type        | Null | Key | Default | Extra |
# +-------+-------------+------+-----+---------+-------+
# | id    | int(11)     | YES  |     | NULL    |       |
# | name  | varchar(55) | YES  |     | NULL    |       |
# +-------+-------------+------+-----+---------+-------+
show columns from table_01;

# [v10.1.9]
# +-------+-------------+------+-----+---------+-------+
# | Field | Type        | Null | Key | Default | Extra |
# +-------+-------------+------+-----+---------+-------+
# | id    | int(11)     | NO   | PRI | NULL    |       |
# | name  | varchar(55) | NO   |     | NULL    |       |
# | age   | int(11)     | NO   |     | NULL    |       |
# +-------+-------------+------+-----+---------+-------+
alter table table_01 add age int not null;
alter table table_01 modify id int not null primary key;
alter table table_01 modify name varchar(55) not null;

# [v10.1.9]
# +-------+-------------+------+-----+---------+-------+
# | Field | Type        | Null | Key | Default | Extra |
# +-------+-------------+------+-----+---------+-------+
# | id    | int(11)     | NO   | PRI | NULL    |       |
# | name  | varchar(55) | NO   |     | NULL    |       |
# +-------+-------------+------+-----+---------+-------+
alter table table_01 drop age;

# [v10.1.9]
# +----+-----------+
# | id | name      |
# +----+-----------+
# |  0 | something |
# |  1 | aaa       |
# +----+-----------+
insert into table_01 (name) values("something");
insert into table_01 (name) values("aaa");
select * from table_01;

# [v10.1.9]
# +----+----------+
# | id | name     |
# +----+----------+
# |  0 | modified |
# |  1 | aaa      |
# +----+----------+
update table_01 set name = "modified" where id = 0;

# [v10.1.9]
# +----+----------+
# | id | name     |
# +----+----------+
# |  1 | aaa      |
# +----+----------+
delete from table_01 where id = 0;

# [v10.1.9]
# Empty set
truncate table table_01;

# [v10.1.9]
# Empty set
drop table if exists table_01;
show tables;
