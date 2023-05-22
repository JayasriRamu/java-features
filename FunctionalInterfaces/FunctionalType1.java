package FunctionalInterfaces;

//Type 1 : Ref Static method
interface Sayable {
    void say();
}

public class FunctionalType1 {
    public static void saySomething() {
        System.out.println("Hello, this is static method.");
    }

    public static void main(String[] args) {
        // Referring static method
        Sayable sayable = FunctionalType1::saySomething;
        // Calling interface method
        sayable.say();
    }
}
