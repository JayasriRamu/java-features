package FunctionalInterfaces;

interface Doable {
    default void doIt() {
        System.out.println("Do it now");
    }
}

@FunctionalInterface
interface Sayable extends Doable {
    void say(String msg); // abstract method
}

public class F3 implements Sayable {

    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String args[]) {
        System.out.println("hello");
        F3 fie = new F3();
        // fie.say("Hello there");
        // // fie.doIt();
    }
}
