package com.object_and_class_2;

public class Main {

    public static void main(String[] args) throws Exception{

        AxisBank ab = new AxisBank();
        SBIBank sb = new SBIBank();
        Bank b = new Bank();

        System.out.println(ab.getRateOfInterest());
        System.out.println(sb.getRateOfInterest());
        System.out.println(b.getRateOfInterest());

//        Adder a = new Adder();
//        System.out.println(a.add(2,3));
//        System.out.println(a.add(2,3,4));
//        System.out.println(a.add(2.2f,3,4));
//        Rectangle r = new Rectangle();
//        r.area(20, 30);
//        r.display();
//        Vehicle v = new Car();
//        v.run();
//        v.displayVehicle();
//        Car c = new Car();
//        c.run();
//        try{
//            ThrowExample.validate(15);
//        } catch(Exception e) {
//            e.printStackTrace();
////            System.out.println(e.toString());
//        }


//        Dog d = new Dog();
//
//        d.display();

//        Student student = new Student(100, "Anil");
//
//        student.setName("fuck");
//
//        System.out.println("college: " + student.getCollege());
//        student.id = 100;
//        student.name = "Anil";

        //System.out.println("student: " + student.toString());
//        System.out.println("id: " + student.getId() + "  \nname: " + student.getName());


    }
}


