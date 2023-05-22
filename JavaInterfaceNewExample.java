interface Int1 {
    void show();

    default void myprint() {
        System.out.println("From int 1");
    }

    default void hello() {
        System.out.println("From hello int 1");
    }
}

interface Int2 {
    void myshow();

    default void myprint() {
        System.out.println("From int 2");
    }
}

class TestInterface implements Int1, Int2 {
    public void show() {
        System.out.println("hello show");
    }

    public void myshow() {
        System.out.println("My show");
    }

    public void myprint() {
        System.out.println("My show");
    }
}

class JavaInterfaceNewExample {
    public static void main(String args[]) {
        TestInterface t1 = new TestInterface();
        t1.show();
        t1.myshow();
        t1.myprint();
        t1.hello();
    }
}