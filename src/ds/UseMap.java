package ds;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        Map<Integer,User> user = new HashMap<Integer,User>();
        user.put(1, new User("Kabir","abc123","10-12-1990"));
        user.put(1, new User("Jose","abc124563","02-12-1990"));
        user.put(1, new User("Vallerie","nms342","10-05-1991"));

        for(Map.Entry<Integer, User> profile:user.entrySet()){
            System.out.println(profile.getKey()+""+profile.getValue().getUserName()+
                    " "+profile.getValue().getPassword()+""+profile.getValue().getDob());
        }
    }
}
