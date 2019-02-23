package map_interface;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(110, "Anil");
        treeMap.put(111, "Anal");
        treeMap.put(112, "Anol");
        treeMap.put(113, "Anul");
        treeMap.put(114, "Anil");
        treeMap.put(110, "Anil");

        Set keysSet = treeMap.entrySet();

        Iterator mapItr = keysSet.iterator();

        while(mapItr.hasNext()){
            Map.Entry entry = (Entry) mapItr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
