package Task_1;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initial data");
        printDataProducts(DataProvider.getAllDataProducts());
        System.out.println("Updated data");
        printDataProducts(updateDataProducts(DataProvider.getAllDataProducts(), "grape"));

    }

    public static Set<String> updateDataProducts(Set<String> dataProducts, String nameProduct) {
        dataProducts.add(nameProduct);
        return dataProducts;
    }

    public static void printDataProducts(Set<String> dataProducts) {
        int count = 1;
        for (String s : dataProducts) {
            System.out.println(count + ") " + s);
            count++;
        }
    }
}
