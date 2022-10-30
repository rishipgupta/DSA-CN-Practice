package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1, 80);
        System.out.println(arr.size());
        System.out.println(arr.get(1));

        //To specify default capacity of ArrayList you can do that
        ArrayList<String> strArrList = new ArrayList<>(20);
        //Above code shows out initial Capacity is set to 20;
        //By default it is of capacity = 10;
    }
}
