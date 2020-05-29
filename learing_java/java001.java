package learing_java;

//import java.util.ArrayList;

public class java001 {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        int[] arr2 = new int[4];
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr2.length-1] = 4;
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }


        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        System.out.println(list.get(0));
        */



    }
}