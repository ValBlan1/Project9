package ds;

import java.util.HashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String >();
        map.put("Usa","NY");
        map.put("Canada","Montreal");
        for(Map.Entry<String,String> data:map.entrySet()){
            System.out.println(data.getKey()+" "+data.getValue());
        }

    }
}
