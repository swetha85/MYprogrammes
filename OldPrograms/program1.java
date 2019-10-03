package OldPrograms;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("enter the first number");
        System.out.println("enter the second number");
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        double avg = calculateavg(a,b);
        System.out.println("average of two numbers is" +avg);

        }
       public static double calculateavg(int a,int b){
        double avg = (double) (a+b)/2;
        return avg;

    }

}






