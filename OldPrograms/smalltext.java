package OldPrograms;

import java.util.Scanner;

public class smalltext {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter text");
        String text1 = userInput.next();
        System.out.println("enter text");
        String text2 = userInput.next();
        while(!text1.equals(text2)){
            text1=text2;
            System.out.println("enter a text");
            text2= userInput.next();

        }

           System.out.println("I am exiting");



    }
}