package functionalinterface;

@FunctionalInterface
interface A {
    void printSomething(String msg); // abstract method

    default void alertOnStart() { // non - abstract method
        System.out.println("Printing started....");
    }

    static void test() {
        System.out.println("Printing");
    }
}

public class CustomFI {
    public static void main(String[] args) {
        A a1 = (msg) -> System.out.println("Printing message: " + msg);

        A a2 = new A() {
            @Override
            public void printSomething(String msg) {
                System.out.println("Anonymous implementation");
                System.out.println("Printing message: " + msg);
            }
        };

        a1.alertOnStart();
        a1.printSomething("How are you");

        System.out.println();

        a2.alertOnStart();
        a2.printSomething("How are you");
    }
}
