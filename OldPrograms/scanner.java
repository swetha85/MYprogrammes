package OldPrograms;

import java.util.Scanner;
public class scanner {
    public static void main(String[] args){

        Scanner userInput =new Scanner(System.in);
        System.out.println("enter number;");
        int input = userInput.nextInt();
            multiplication(input);
    }

    public static void multiplication(int x){
        System.out.println("multiplication of "+ x + " is: ");
        for(int i=1;i<=10;i++){
            System.out.println(x*i);

        }

    }

}