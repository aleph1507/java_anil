package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeHashSetExample {

    public static void main(String[] args) {

        TreeSet<Employee> employeesTreeSet = new TreeSet<Employee>();
        //LinkedList<String> names = Employee.generateNames(10);
        ArrayList<String> names = Employee.generarateNamesArrList(10);

//        for(int i = 0; i<names.size(); i++) {
//            employeesTreeSet.add(new Employee(i, names.get(i)));
//        }

        Employee.addEmployeesToCollection(employeesTreeSet, names);

        System.out.println(employeesTreeSet);

    }
}
