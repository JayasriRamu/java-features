package FunctionalInterfaces;

@FunctionalInterface
interface sayable {
    void say(String msg);
}

public class FuncInt1 {
    public void say(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FuncInt1 fie = new FuncInt1();
        fie.say("Hello there");
    }
}
