#SCRIPT

**Create Table Format TexFile**

```
REATE EXTERNAL TABLE  city(
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

**Load file into table**
```


LOAD DATA  
INPATH '/citydata.csv'
OVERWRITE
INTO  table city;

```

**Create file into Avro**
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


