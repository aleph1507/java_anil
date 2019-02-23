package map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(101, "Anil");
        map.put(102, "Xyz");
        map.put(103, "Anil");
        map.put(104, "Xyz");
        map.put(105, "Jki");
        map.put(101, "Anil");

        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
