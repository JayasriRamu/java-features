import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;

public class ForEachExample {

    public static void main(String[] args) {

        String s1[] = { "Java", "Spring", "boot", "Hibernate" };

        List<String> myList1 = new ArrayList<String>();

        for (int i = 0; i < s1.length; i++) {
            myList1.add(s1[i]);
        }

        // creating sample Collection
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            myList.add(i);

        // traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator Value::" + i);
        }
        // traversing through forEach method of Iterable with anonymous class
        myList.forEach(new Consumer<Integer>() {

            public void accept(Integer t) {
                System.out.println("forEach anonymous class Value::" + t);
            }
        });

        myList1.forEach(new Consumer<String>() {

            public void accept(String t) {
                System.out.println("forEach anonymous class Value::" + t);
            }
        });

        // traversing with Consumer interface implementation
        MyConsumer action = new MyConsumer();
        myList.forEach(action);

        MyConsumer1 action1 = new MyConsumer1();
        myList1.forEach(action1);

    }

}

// Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println("Consumer impl Value::" + t);
    }
}

class MyConsumer1 implements Consumer<String> {
    public void accept(String s) {
        System.out.println("Consumer impl value " + s);
    }
}
