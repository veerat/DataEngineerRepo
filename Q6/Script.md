#SCRIPT

**Scala Code**

```

val one = sc.textFile("/Users/sagardisawal/Documents/City.csv");
val two = one.map(x => x.split(','))
val three = two.map(x=>s"${x(0)}\t${x(1)}\t${x(2)+","+x(3)}") 
val four = three.saveAsTextFile("ansCity2.tsv")

```
