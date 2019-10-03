package OldPrograms;

import java.util.Scanner;

public class passwardCheck {
    public static void main(String[] args) {
         passwardCheck();
    }

    public static void passwardCheck() {
        Scanner userInput = new Scanner(System.in);
        String Pwd1 = "one";
        String Pwd2 = "two";
        String Pwd3 = "three";
        for(int attempts = 0; attempts<5; attempts++) {
        System.out.println("enter passward1");
        String passward1 = userInput.next();
        System.out.println("enter password2");
        String passward2 = userInput.next();
        System.out.println("enter password3");
        String passward3 = userInput.next();
            if (passward1.equals(Pwd1) && passward2.equals(Pwd2) && passward3.equals(Pwd3)) {
                System.out.println("congartulations");
                break;
            }
             else {
                System.out.println("try next time");
            }
        }
    }
}









