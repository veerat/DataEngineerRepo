#Script

I am using data from one of our lab.

**Create Table sales & stores**

```
CREATE TABLE sales(
id string,
code string,
price double
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ' '
STORED AS TEXTFILE;



CREATE TABLE stores(
id string,
disc double,
state string
)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ' '
STORED AS TEXTFILE;

LOAD DATA LOCAL
INPATH '/root/data/sales.txt'
OVERWRITE INTO TABLE sales;

LOAD DATA LOCAL
INPATH '/root/data/stores.txt'
OVERWRITE INTO TABLE stores;

```
**Query to Find  5 states with Highest Transaction Amount**

```
SELECT st.state, SUM(price) as p
FROM sales sa JOIN stores  st 
ON sa.id = st.id
GROUP BY st.state
DISTRIBUTE BY p
SORT BY p DESC
LIMIT 5;

```
