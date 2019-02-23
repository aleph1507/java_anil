package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();

        Employee emp1 = new Employee(101, "Anil");
        Employee emp2 = new Employee(102, "Anal");
        Employee emp3 = new Employee(103, "Thakur");
        Employee emp4 = new Employee(104, "Kur");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        for(Employee e:employees) {
            System.out.println(e.toString());
        }

//        ArrayList arr = new ArrayList();
//        arr.add("anil");
//        arr.add(123);
//        System.out.println(arr.set(1, 1));
//
//        ArrayList<String> str_arr = new ArrayList<String>();
//        str_arr.add("asdasdasd");
//        str_arr.add("xyz");
//
//        for(String str:str_arr) {
//            System.out.println(str);
//        }

//        ArrayList<String> str_arr1 = new ArrayList<String>();
//        str_arr1.add("qweqwe");
//        str_arr1.addAll(str_arr);
//
//        str_arr1.remove("xyz");
//        str_arr1.removeAll(str_arr);

//        for(String sa2:str_arr1) {
//            System.out.println(sa2);
//        }
    }
}
