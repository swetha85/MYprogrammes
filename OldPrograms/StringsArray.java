import java.awt.*;
import java.util.*;

public class StringsArray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean res = true;
        System.out.println("enter string");
        String s1 = userInput.next();
        ArrayList<String> finalArray = new ArrayList<String>();
        finalArray.add(s1);
        while (res) {
            System.out.println(("enter string"));
            String s2 = userInput.next();
            finalArray.add(s2);
            if (s2.length() <= s1.length()) {
                System.out.println(finalArray);
                res = false;
            }
            s1 = s2;
        }

    }
}



