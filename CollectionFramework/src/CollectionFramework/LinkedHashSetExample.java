package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<Employee> employees_hash_set = new LinkedHashSet<Employee>();
        LinkedList<String> names = Employee.generateNames(5);

//        Iterator<String> namesIterator = names.iterator();

        for(int i = 0; i<names.size(); i++) {
            employees_hash_set.add(new Employee(i, names.get(i)));
        }

        System.out.println(employees_hash_set);

//        StringBuilder name = new StringBuilder();

//        for(int i = 0; i<5; i++) {
//            for(int j = 0; j<3; j++) {
//                name.append((char)(65+i+j));
//            }
//            names.add(name.toString());
//            name = new StringBuilder();
//        }

    }
}
