package FunctionalInterfaces;

@FunctionalInterface
interface sayable {
    void say(String msg); // abstract method
    // It can contain any number of Object class methods.

    int hashCode();

    String toString();

    boolean equals(Object obj);
}

public class FuncInt2 {
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FuncInt2 fie = new FuncInt2();
        fie.say("Hello there Fun Interface");
    }
}
