
#SCRIPT

##Hive 

**Create Hive Table && Load Data**

This is the table already present in HDFS

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
```

LOAD DATA  
INPATH '/citydata.csv'
OVERWRITE
INTO  table city;

```

**Create Result Table**

```
CREATE EXTERNAL TABLE  cityOne(
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
**Register Jar && Create Function**


```
ADD JAR /media/sf_sagardisawal/HiveUDF/target/DE-1.0-SNAPSHOT.jar
CREATE TEMPORARY FUNCTION city_full as 'DE.App';

```

**Load Data in Result Table**
```
FROM city
INSERT OVERWRITE TABLE cityOne
SELECT id,code,city_full(name),year

```

##Bash

```

cd HiveLab
mvn package
find . -iname '*.jar' | grep SNAPSHOT

```



