package OldPrograms;

import java.util.Scanner;

public class calculateTax {

        public static void main(String[] args){
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the salary");
            int salary= userInput.nextInt();
        double tax= calculateTax(salary);
        System.out.println("My tax is "+tax);

    }
    public static double calculateTax(int salary) {
        double tax;
        if (salary > 100000) {
            tax = salary * 0.4;
        } else {
            tax = salary * 0.3;
        }

        return tax;
    }
}

