import java.lang.reflect.Array;
import java.util.*;

public class test {
    private void sayHi(String title) {
        System.out.println(title);
    }

    private void arrayListTest(List<Integer> arr) {
        arr.add(32);
        System.out.println("Added " + arr.get(arr.size() - 1));
    }

    public static void main(String[] args) {
        test t = new test();
        t.sayHi("Data structures");

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(1, 1);
        list.add(0, 22);
        list.add(0, 5);
        //Collections.sort(list);

        for(int i = 0; i< list.size();i++) {
            var sum = 3;
        }

        System.out.println("Array list: " + list);
        t.arrayListTest(list);

        Stack<String> stack = new Stack<>();
        stack.push("pancake 1");
        stack.push("pancake 2");
        stack.push("pancake 3");
        stack.push("pancake 4");
        stack.pop();
        System.out.println("Stack: " + stack);

        Hashtable<Integer, String> h = new Hashtable<>();


        Vector<Double> v = new Vector<>();

        v.add(3.0);
        v.add(3.4);
        v.add(0.75);

        double vsum = 0.0;

        for (int i = 0; i < v.size(); i++) {
            vsum += v.get(i);
        }
        System.out.println("Vector: " + v);
        System.out.println("Sum of vector: " + vsum);
    }
}
