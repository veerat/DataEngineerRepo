#SCRIPT

I am using data from on of our lab

**Query to Know the create Query of Table**

```

SHOW CREATE TABLE sales;
DESCRIBE FORMATTED TABLE sales;

```
```
DROP TABLE IF EXISTS  sales;
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

DROP TABLE IF EXISTS  sales_part;
CREATE TABLE sales_part(
  id INT,
  sale_date STRING,
  store INT,
  product INT,
  amount DOUBLE
)
PARTITIONED BY (state STRING)
CLUSTERED BY (title) INTO 12 BUCKETS;
ROW FORMAT DELIMITED 
FIELDS TERMINATED BY ','
STORED AS TEXTFILE;

FROM sales 
INSERT INTO TABLE sales_part PARTITION(state)
SELECT id,sale_date,store,product,amount,state;

```

