package CollectionsRefresh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Refresh {
    public Refresh() {

    }

    // { 1,1,3,4,5,5,7,8,8,9 }
    public ArrayList<String> test_array_lists(ArrayList<String> cities ) {
        // iterate through the list and remove duplicates
        for (int i = 0; i < cities.size(); i++) {
            for (int j = i + 1; j < cities.size(); j++) {
                if (cities.get(i).equals(cities.get(j))) {
                    cities.remove(j);
                    j--;
                }
            }
        }
        return cities;
    }

    public void test_hash_map() {
        HashMap<String, Integer> agesHash = new HashMap<String, Integer>();

        agesHash.put("John", 36);
        agesHash.put("Alex", 30);
        agesHash.put("Bob", 25);
        agesHash.put("Alice", 27);

        System.out.println("Ages of people:" + agesHash);

        for (Map.Entry<String, Integer> entry : agesHash.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        if (!agesHash.containsKey("Alex")) {
            System.out.println("Alex is not in the map");
        }

    }
}
