import java.util.Scanner;

public class EnterNumber{
    public static void main(String[] args) {

        boolean res = answer();
        while (!res) {
            res = answer();
        }
    }

    public static boolean answer() {
        Scanner userInput = new Scanner(System.in);
        System .out.println("enter a number");
        int n = userInput.nextInt();
        int min = 0;
        int max = 10;
        if (n >= min && n < max) {
            System.out.println("Congratulations");
            return true;
        } else {
            System.out.println("wrong number");
            return false;
        }
    }
}


