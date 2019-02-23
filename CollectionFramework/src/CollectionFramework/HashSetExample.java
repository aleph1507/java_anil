package CollectionFramework;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<Employee> employees_set = new HashSet<Employee>();

        LinkedList<String> names = new LinkedList<String> ();

        StringBuilder sb = new StringBuilder();

        names = Employee.generateNames(5);

//        for(int i = 0; i<5; i++) {
//            for(int j = 0; j<3; j++) {
//                sb.append((char)(65+i+j));
//            }
//            names.add(sb.toString());
//            sb = new StringBuilder();
//        }

        int emp_serial = 0;

        for(String name:names) {
            employees_set.add(new Employee(emp_serial, names.get(emp_serial++)));
        }

        System.out.println(employees_set);


//        HashSet<String> string_set = new HashSet<String>();
//
//        string_set.add("qwe");
//        string_set.add("qwe");
//        string_set.add("abc");
//
//        Iterator<String> sit = string_set.iterator();
//
//        StringBuilder sb = new StringBuilder(string_set.size());
//
//        while(sit.hasNext()) {
//            sb.append(sit.next() + "\n");
//        }
//
//        System.out.println(sb);

//        HashSet set = new HashSet();
//
//        set.add("abc");
//        set.add(1);
//        set.add("xyz");;
//        set.add("abc");
//
//        Iterator it = set.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

//        System.out.println(set);
    }
}
