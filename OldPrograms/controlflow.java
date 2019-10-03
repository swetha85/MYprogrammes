import java.util.Scanner;

public class controlflow {
    public static void main(String[] args) {
        addTwoIntegers(5, 3);
    }

    private static void addTwoIntegers(int x, int y) {
       // System.out.println(x + "+" + y);
        int sum = x + y;
        System.out.println(x + "+" + y +"=" + sum);
    }
}