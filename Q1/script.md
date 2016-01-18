
#SCRIPT

** Create Hive table **

```
CREATE EXTERNAL TABLE  city(
  id string,
  code string,
  name string,
  year string
)
row format DELIMITED
fields TERMINATED by ','
stored as TEXTFILE
LOCATION '/user/root/hiveUDF';

```


