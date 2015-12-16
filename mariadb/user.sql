# [v10.1.9]
create user nju33;

# [v10.1.9]
# +-------+-----------+----------+
# | user  | host      | password |
# +-------+-----------+----------+
# | nju33 |           |          |
# +-------+-----------+----------+
select user, host, password from mysql.user

# [v10.1.9]
# +-----------------------------------+
# | Grants for nju33@%                |
# +-----------------------------------+
# | GRANT USAGE ON *.* TO 'nju33'@'%' |
# +-----------------------------------+
show grants for nju33;

# [v10.1.9]
# +--------------------------------------------+
# | Grants for nju33@%                         |
# +--------------------------------------------+
# | GRANT ALL PRIVILEGES ON *.* TO 'nju33'@'%' |
# +--------------------------------------------+
grant all on *.* to nju33@'localhost';

# [v10.1.9]
# +----------------------------------------------------+
# | Grants for nju33@localhost                         |
# +----------------------------------------------------+
# | GRANT ALL PRIVILEGES ON *.* TO 'nju33'@'localhost' |
# +----------------------------------------------------+
rename user nju33 to nju33@'localhost';
show grants for nju33@'localhost';

# [v10.1.9]
# from root
set password for nju33@'localhost' = password('password');
# from nju33
set password = password('password');

# [v10.1.9]
# There is no such grant defined for user 'nju33' on host 'localhost'
drop user nju33@'localhost';
