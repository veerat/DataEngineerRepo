#SCRIPT

**Create Table TextFile Format**

```
REATE EXTERNAL TABLE  city(
  id string,
  code string,
  name string,
  year string
)
ROW FORMAT  DELIMITED
FIELDS TERMINATED by ','
STORED AS TEXTFILE
LOCATION '/user/root/hiveUDF';
```

**Load File into Table**
```


LOAD DATA  
INPATH '/citydata.csv'
OVERWRITE
INTO  table city;

```

**Create Table into Avro Format**
```

CREATE TABLE city_avro_ext(
id string,
code string,
name string,
year string
)
STORED AS AVRO
LOCATION '/user/root/cityavro';

```
**Load Data from Table city**

```

FROM city
INSERT OVERWRITE TABLE city_avro_ext
SELECT * ;

```

