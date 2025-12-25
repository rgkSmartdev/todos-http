import CollectionsRefresh.Refresh;
import freecode.SymmetricDifference;
import freecode.TestThread;
import todo.TodoClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello Todos");
        SymmetricDifference sD = new SymmetricDifference();
        int[] res = sD.findSymmetricDifference(new int[]{1, 2, 3}, new int[]{2, 4, 5}, new int[]{3, 4, 5, 6}, new int[]{2,3});
        System.out.println(Arrays.toString(res));

        System.out.println(Arrays.toString(sD.selectionSort(new int[]{7,4,1,5,3})));

        System.out.println(Arrays.toString(sD.bubbleSort(new int[]{7,4,1,5,3})));
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("London");
        cities.add("London");
        cities.add("Madras");
        cities.add("Bombay");
        cities.add("Bombay");
        cities.add("Hyderabad");
        System.out.println(new Refresh().test_array_lists(cities));

//        TestThread t1 = new TestThread();
//        t1.start();
    }
}
