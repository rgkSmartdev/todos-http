import freecode.SymmetricDifference;
import todo.TodoClient;

import java.io.IOException;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Hello Todos");
        SymmetricDifference sD = new SymmetricDifference();
        int[] res = sD.findSymmetricDifference(new int[]{1, 2, 3}, new int[]{2, 4, 5}, new int[]{3, 4, 5, 6}, new int[]{2,3});
        System.out.println(Arrays.toString(res));

        System.out.println(Arrays.toString(sD.selectionSort(new int[]{7,4,1,5,3})));

        System.out.println(Arrays.toString(sD.bubbleSort(new int[]{7,4,1,5,3})));
    }
}
