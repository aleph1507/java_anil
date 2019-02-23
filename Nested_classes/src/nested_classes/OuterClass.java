package nested_classes;

public class OuterClass {

    private int a = 30;

    class InnerClass {
        public void message() {
            System.out.println("a = " + a);
        }
    }

    public static void main(String[] args) {

        OuterClass outer = new OuterClass();

        OuterClass.InnerClass inner = outer.new InnerClass();
        //InnerClass.message();

        inner.message();

    }
}
