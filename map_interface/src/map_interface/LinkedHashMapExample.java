package map_interface;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> linked_map = new LinkedHashMap<Integer, String>();
        linked_map.put(1, "Anil");
        linked_map.put(2, "Anal");
        linked_map.put(3, "shuklur");
        linked_map.put(4, "qweqwe");
        linked_map.put(1, "Anil");
        linked_map.put(null, "asd");

        Set setKeys = linked_map.entrySet();

        Iterator setKeysIterator = setKeys.iterator();

        while(setKeysIterator.hasNext()){
            Map.Entry entry = (Map.Entry)setKeysIterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

//        for(Map.Entry entry:linked_map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

    }
}
