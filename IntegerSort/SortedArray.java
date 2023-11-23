import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {
    //public static void main(String[] args) {
        
        //int[] unsortedArray = getIntegers(5);
        //int[] sortedArray = sortIntegers(unsortedArray);
        
    //}
    
    public static int[] getIntegers(int len){
        
        Scanner scnr = new Scanner(System.in);
        int[] userArray = new int[len];
        System.out.println("Enter " + len + " integer values:\r");
        for (int i = 0; i < len; i++) {
            userArray[i] = scnr.nextInt();
        }
        
        return userArray;
        
    }
    
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
    
 