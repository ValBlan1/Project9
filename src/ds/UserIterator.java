package ds;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserIterator {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<Integer>();
        list.add(10);
        list.add(40);
        list.add(17);
        list.add(16);

        Iterator it = list.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(Integer data:list){
            System.out.println(data);
        }

    }
}
