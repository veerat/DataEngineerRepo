package DE;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App extends UDF
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    static Map<String,String> cityMap =  new HashMap<>();

    static {
        cityMap.put("ft","Fort Worth");
        cityMap.put("sf","San Francisco");
        cityMap.put("ny","New York");
        cityMap.put("sj","San Jose");
        cityMap.put("nj","New Jersey");

    }

    public String evaluate(String city){
        String temp = city.toLowerCase().trim();

        if (cityMap.containsKey(temp)){
            return cityMap.get(temp);
        }
        return city;
    }





}
