#SCRIPT

I am using data from on of our lab

**Query to Know the create Query of Table**

```

SHOW CREATE TABLE sales;
DESCRIBE FORMATTED TABLE sales;

```
```
CREATE EXTERNAL TABLE sales(
  id INT,
  sale_date STRING,
  store INT,
  state STRING,
  product INT,
  amount DOUBLE
)
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
STORED AS TEXTFILE
LOCATION '/user/root/sales'
TBLPROPERTIES("skip.header.line.count"="1");


CREATE TABLE sales_part_one(
  id INT,
  sale_date STRING,
  store INT,
  product INT,
  amount DOUBLE
)
PARTITIONED BY (state STRING)
CLUSTERED BY (id) INTO 3 BUCKETS
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
STORED AS TEXTFILE;

FROM sales
INSERT OVERWRITE TABLE sales_avro_one
PARTITION (state)
SELECT id, sales_date, store,product,amount;

```

