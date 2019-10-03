package OldPrograms;

import java.util.*;

public class basicArray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter a number");
        int x = userInput.nextInt();
        int[] a = CreateArray(x);
        printArray(a);
       int[] newestArray= doubleupArray(a);
        printArray(newestArray);
    }

    public static int[] CreateArray(int x) {
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
    public static int[] doubleupArray(int[] a){
        int [] longArray = new int[a.length*2];
        for(int i=0;i<a.length;i++) {
            longArray[i] = a[i];
      }
        return longArray;
    }
}


