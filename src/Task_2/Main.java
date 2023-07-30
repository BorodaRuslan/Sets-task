package Task_2;

import java.util.NoSuchElementException;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Initial data");
        printDataProducts(DataProvider.getAllDataProducts());
        System.out.println("Updated data");
        printDataProducts(removeDataProducts(DataProvider.getAllDataProducts(), "kiwi"));
    }
    public static Set<String> removeDataProducts(Set<String> dataProducts, String nameProduct){
        if ( dataProducts.contains(nameProduct)){
             dataProducts.remove(nameProduct);
        } else {
            throw new NoSuchElementException("Such an object does not exist!");
        }
        return  dataProducts;
    }
    public static void printDataProducts(Set<String> dataProducts){
        int count = 1;
        for (String s: dataProducts){
            System.out.println(count + ") " + s);
            count++;
        }
    }
}
