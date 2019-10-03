package OldPrograms;

import java.util.Scanner;

public class PassingArguments {
    private static Object String;

    public static void main(String[] args) {
        String a = "false";
        String b = "true";
        String c = "false";
        String d = "false";
        boolean value = anyIsTrue(a, b, c, d);
        System.out.println(value);
        boolean newValue = areAllFalse(a, b, c, d);
        System.out.println(newValue);
    }

    private static boolean areAllFalse(String a, String b, String c, String d) {
        if (a.equals("false") || b.equals("false") || c.equals("false") || d.equals("false")) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean anyIsTrue(String a, String b, String c, String d) {
        if (a.equals("true") || b.equals("true") || c.equals("true") || d.equals("true")) {
            return true;
        } else {
            return false;
        }

    }
}

