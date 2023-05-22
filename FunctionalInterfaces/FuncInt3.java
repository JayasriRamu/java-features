package FunctionalInterfaces;

interface Doable {
    default void doIt() {
        System.out.println("Do it now");
    }
}

// @FunctionalInterface
interface Sayable extends Doable {
    void say(String msg); // abstract method
}

public class FuncInt3 implements Sayable {
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FuncInt3 fie = new FuncInt3();
        fie.say("Hello there");
        fie.doIt();
    }
}
