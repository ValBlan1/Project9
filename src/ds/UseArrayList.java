package ds;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your limit: ");
        int limit=sc.nextInt();
        System.out.println("please enter your number: ");
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<limit; i++) {
            list.add(sc.nextInt());
        }
        for(int j=0; j<list.size();j++) {
            System.out.println(list.get(1));
        }

        List<User> userList = new ArrayList<User>();
        userList.add(new User("Vallerie","abc123","10-14-1991"));
        userList.add(new User("Luz","1523sfd","01-13-1960") );
        for (User user:userList){
            System.out.println(user.getUserName()+ ""+user.getPassword()+" "+user.getDob());
        }
    }
}
