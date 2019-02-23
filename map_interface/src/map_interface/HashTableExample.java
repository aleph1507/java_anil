package map_interface;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

public class HashTableExample {

    public static void main(String[] args) {

        Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();

        hashTable.put(110, "Anil");
        hashTable.put(111, "Anal");
        hashTable.put(112, "Anul");
        hashTable.put(113, "Anel");
        hashTable.put(114, "Anil");

        Set hashTableKeysSet = hashTable.entrySet();

        Iterator htksItr = hashTableKeysSet.iterator();

        while(htksItr.hasNext()) {
            Map.Entry entry = (Map.Entry)htksItr.next();
            out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
