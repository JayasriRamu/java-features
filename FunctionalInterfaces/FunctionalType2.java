package FunctionalInterfaces;

//Reference to an Instance Method
interface Sayable {
    void say();
}

public class FunctionalType2 {
    public void saySomething() {
        System.out.println("Hello, this is non-static method.");
    }

    public static void main(String[] args) {
        FunctionalType2 methodReference = new FunctionalType2(); // Creating object
        // Referring non-static method using reference
        Sayable sayable = methodReference::saySomething;
        // Calling interface method
        sayable.say();
        // Referring non-static method using anonymous object
        Sayable sayable2 = new FunctionalType2()::saySomething; // You can use anonymous object also
        // Calling interface method
        sayable2.say();
    }
}
