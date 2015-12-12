# [v10.1.9]
# MariaDB [something]>
mysql -uroot -proot something

# [v10.1.9]
#
# test.sql:
#   create table test (id int);
#
# +---------------------+
# | Tables_in_something |
# +---------------------+
# | test                |
# +---------------------+
mysql -uroot -proot something < test.sql

# [v10.1.9]
# +--------------------+
# | Database           |
# +--------------------+
# | something          |
# +--------------------+
mysql -uroot -proot --execute="show databases"
mysql -uroot -proot -e "show databases"
