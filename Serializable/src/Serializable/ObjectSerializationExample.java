package Serializable;

import java.io.*;

public class ObjectSerializationExample {

    public static void main(String[] args) throws IOException {

        //serialization
        Employee employee = new Employee(101, "Anil", 28, 14000);
        FileOutputStream fileOutputStream = new FileOutputStream("MyObject.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(employee);

        objectOutputStream.close();
        fileOutputStream.close();

        //deserialization
        InputStream input = new FileInputStream("MyObject.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(input);

        try {
            Employee emp = (Employee)objectInputStream.readObject();
            System.out.println(emp.toString());
        } catch(ClassNotFoundException cnfe) {
            System.out.println(cnfe.getMessage());
        }

        objectInputStream.close();
        input.close();
    }
}
