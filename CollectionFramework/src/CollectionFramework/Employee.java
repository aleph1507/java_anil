package CollectionFramework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Employee implements Serializable, Comparable<Employee> {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static LinkedList<String> generateNames(int count) {
        LinkedList<String> names = new LinkedList<String>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<count; i++) {
            for(int j = 0; j < 3; j++) {
                sb.append((char)(65+i+j));
            }
            names.add(sb.toString());
            sb = new StringBuilder();
        }

        return names;
    }

    public static ArrayList<String> generarateNamesArrList(int count) {
        ArrayList<String> names = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<count; i++) {
            for(int j = 0; j<5; j++) {
                sb.append((char)(65+i+j));
            }
            names.add(sb.toString());
            sb = new StringBuilder();
        }

        return names;
    }

    public static Collection addEmployeesToCollection(Collection c, Collection<String> e) {
        int index = 0;
        Iterator it = e.iterator();
        while(it.hasNext()){
            c.add(new Employee(index++, it.next().toString()));
        }

//        for(int i = 0; i<e.size(); i++){
//            c.add(new Employee(i, e.));
//        }

        return c;
    }

    @Override
    public String toString() {
        return this.id + "/" + this.name;
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(employee.id, this.id);
    }
}
