package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> str_list = new LinkedList<String>();
        str_list.add("Anil");
        str_list.add("Anal");

        LinkedList<String> str_list2 = new LinkedList<String>();
        str_list2.add("Thakur");
        str_list2.addAll(str_list);

//        str_list2.remove(2);
//        str_list2.removeFirst();
        str_list2.add(3, "shokur");

//        System.out.println(str_list2);

//        Iterator<String> sl2i = str_list2.iterator();
//        String list_names = "";
//
//        while(sl2i.hasNext()) {
//            list_names = sl2i.next();
//            System.out.println("list_names: " + list_names);
//        }

        LinkedList<Employee> employees_list = new LinkedList<Employee>();
        for(int i = 0; i<str_list2.size(); i++) {
            employees_list.add(new Employee(i, str_list2.get(i)));
        }

        for(Employee e:employees_list){
            System.out.println(e.toString());
        }


//        LinkedList list = new LinkedList();
//        list.add("Anil");
//        list.add(123);
//        list.add("abc");
//        list.add("Sunil");
//
//        System.out.println(list);

    }
}
