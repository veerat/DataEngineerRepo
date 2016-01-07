# DataEngineerRepo


p1: 
Hive table with million rows. 
There are some fields in the table with has short names for cities like 'ft' instead of 'Fort'. 
Task is to convert it into full name like 'Fort'.
One more table with all the city names to be converted given.
Make another hive table which has full names for all the city data.
Store the table data into specified folder

P2: 
Files are getting added to a folder in hdfs.
In real time merge small files into one single file. 
The single file has to be stored in hdfs at a given location


p3: 
Ingest table from mysql into hdfs.
Only one table to be ingested. 
The ingested table should be stored using binary format
Exact format is not specified. 
The table should be compressed using codec compatible with hdfs

p4: 
Hive table.
The table has to be converted into binary format.
Format not mentioned.
The table has to be stored at a specific location.

p5: 
There are two hive table sales and customers.
Write a query to get top 5 states.
We had to join those two tables in order to execute the query. 
Store just the result into the required folder. 
 
p6: 
There is a csv file in hdfs
convert the file into tab separated file
There was address column having comma which should be preserved. 
Store the data into binary format 
Binary format not specified
Store the file at a required folder

p7: 
There is sales team which uses two queries on a hive table using impala
Select * from customer where year='Condition' 
&& 
select * from customer where month= 'Condition' year = 'Condition'
Optimize the hive table for better performance of the query
Format of the conversion not specified.
Store the table into hdfs
