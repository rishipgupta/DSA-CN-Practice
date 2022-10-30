package arraylist;

import java.util.ArrayList;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(20);
        arr.add(30);
        arr.add(30);
        arr.add(30);

        ArrayList<Integer> temp = new ArrayList<>();

        temp.add(arr.get(0));
        for(int i = 1; i<arr.size();i++){
            if(!arr.get(i).equals(arr.get(i-1))){
                temp.add(arr.get(i));
            }
        }

        String listArr = arr.toString();
        System.out.println(listArr);
        String listArrTemp = temp.toString();
        System.out.println(listArrTemp);
    }
}
