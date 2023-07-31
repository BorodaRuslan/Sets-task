package Task_2;

import java.util.HashSet;
import java.util.Set;

public class DataProvider {
    public static Set<String> getAllDataProducts(){
        Set<String> dataProducts = new HashSet<>();
        dataProducts.add("orange");
        dataProducts.add("apple");
        dataProducts.add("kiwi");
        dataProducts.add("strawberry");
        dataProducts.add("mango");
        return dataProducts;
    }
}
