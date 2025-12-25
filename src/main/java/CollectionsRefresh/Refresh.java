package CollectionsRefresh;

import java.util.ArrayList;

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
}
