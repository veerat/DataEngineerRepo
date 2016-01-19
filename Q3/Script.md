#SCRIPT

**Sqoop Job**

```

sudo -u hdfs sqoop import \
--connect jdbc:mysql://localhost/movielens \
 --driver com.mysql.jdbc.Driver \
--table movies \
--username hadoop \
--as-avrodatafile \
--delete-target-dir \
--target-dir '/user/root/sqoop' \
--compress  \
--compression-codec 'snappy'


```

**Question**

Do we need to specify ----fields-terminated-by '\t'  for avro format?

