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
        System.out.println("Array list: " + list);

        Stack<String> stack = new Stack<>();
        stack.push("Kobayashi");
        stack.push("Tohru");
        stack.push("Kanna");
        stack.push("Elma");
        stack.push("Fafnir");
        stack.push("Lucuoa");
        System.out.println("Stack: " + stack);

        Hashtable<Integer, String> h = new Hashtable<>();


        Vector<Double> v = new Vector<>();

        v.add(3.0);
        v.add(3.4);
        v.add(0.75);

        double vsum = 0.0;

        for (Double aDouble : v) {
            vsum += aDouble;
        }
        System.out.println("Vector: " + v);
        System.out.println("Sum of vector: " + vsum);

        System.out.println("This was me learning about data structures that really don't do anything. I think you're" +
                " supposed to do algorithms and stuff with it. Maybe I try to do some sorting algorithms now?");
        //found a quick sort on Google (I have no idea how it works)
        Integer arrList[] = new Integer[list.size()];
        arrList = list.toArray(arrList);
        sort.quickSort(arrList, 0, list.size() - 1);
        System.out.println(Arrays.toString(arrList)); //yes... it worked (yay!!) wonder if I can add a method for arrlist... TODOoo????
    }
}
