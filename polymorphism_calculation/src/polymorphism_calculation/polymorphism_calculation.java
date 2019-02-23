package polymorphism_calculation;



public class polymorphism_calculation {

    //runtime, dynamic polymorphism

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.run();

        v = new Car();
        v.run();

        v = new Byke();
        v.run();
    }


    //compile time, static, polymorphism
//    public int add(int a, int b) {
//        return a+b;
//    }
//
//    public int add(int a, int b, int c) {
//        return a+b+c;
//    }
//
//    public static void main(String[] args) {
//        polymorphism_calculation pc = new polymorphism_calculation();
//
//        int sum1 = pc.add(2,3);
//        int sum2 = pc.add(2,3,4);
//        System.out.println("sum1 = " + sum1 + "\nsum2 = " + sum2);
//    }
}
