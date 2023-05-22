interface Test1 {
    void show();

    default void myshow1() {
        System.out.println("In myshow Test1");
    }
}

interface Test2{
    void show();
    default void myshow2(){
        System.out.println("From test myprint method");
    }
}

class MainTest implements Test1, Test2 {
    public void show() {
        System.out.println("From show method ");
    }
    public void myshow(){
        System.out.println("Inside Main Test");
    }
}

public class InterfaceExample {
    public static void main(String args[]) {
        MainTest mtest = new MainTest();
        mtest.myshow();
        mtest.show();

    }

}
