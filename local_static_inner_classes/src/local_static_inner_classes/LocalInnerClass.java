package local_static_inner_classes;

public class LocalInnerClass {

    public Object display() {
        class LocalInnerC {
            public void message() {
                System.out.println("message from local inner class");
            }
        }
        LocalInnerC l = new LocalInnerC();
        l.message();

        return l;
    }

    public static void main(String[] args) {
        LocalInnerClass i = new LocalInnerClass();
        Object l = i.display();
        //System.out.println("l.getClass: " + l.getClass());
        //System.out.println("l.toString: " + l.toString());
        //l.message();
        StaticNestedClassExample.StaticInner snce = new StaticNestedClassExample.StaticInner();
        snce.display();

    }
}
