package ds;

import java.util.*;

public class UseListMap {
    public static void main(String[] args) {
        List<String> cityOfUsa = new ArrayList<String>();
        cityOfUsa.add("NY");
        cityOfUsa.add("CA");
        List<String>  cityOfCanada =new ArrayList<String>();
        cityOfCanada.add("montreal");
        cityOfCanada.add("Manchester");
        List<String>  cityOfUK =new ArrayList<String>();
        cityOfUK.add("London");
        cityOfUK.add("Scotland");

        Map <String, List<String>> cities = new LinkedHashMap<String,List<String>>();
        cities.put("Usa",cityOfUsa);
        cities.put("UK",cityOfUK);
        cities.put("Canada", cityOfCanada);
        for (Map.Entry<String,List<String>> city:cities.entrySet()){
            System.out.println(city.getKey()+ " "+ city.getValue());



      //  for(Map.Entry<String, String> data: Map.entrySet()){
        //    System.out.println();
        }


    }
}
