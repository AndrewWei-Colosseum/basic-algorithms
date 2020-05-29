import java.util.Arrays;
public class array {
    public static void main(final String[] args) {
        // two dimensional array display
        int[][] array = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };
        System.out.println(array[0][0]);

        // calling binarySearch function under sorting array to find the index 
        int[] array2 = new int[6];
        for(int i = 0;i < array2.length; i++) {
            array2[i] = i+1;
            System.out.println(array2[i]);
        }
        int index = Arrays.binarySearch(array2, 5);
        System.out.println(index);

        // sorting an array
        int[] array3 = {1,4,3,7,54,23,8,0};
        Arrays.sort(array3);
        for(int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        
        // do-while loop
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    
        // the enhanced for loop (recommend to use this for version ! ! !)
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int item : numbers) {
            System.out.println("Count is: "+item);
        }

        
        
    }

}

