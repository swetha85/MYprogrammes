import java.util.Scanner;

public class AverageInArray {

    public static void main(String[] args) {

       Scanner userInput = new Scanner(System.in);
        System.out.println("enter no of elements");

        int n = userInput.nextInt();
        double[] a = new double[n];
             System.out.println("enter the elements");
        double avg = calculateAvg(a,n);
    }
    public  static double calculateAvg(double []a,int n){
                    double sum =0;
        Scanner userInput = new Scanner(System.in);
            for (int i=0;i<n;i++){
                 a[i] = userInput.nextInt();;
                sum = sum + a[i];
            }
        System.out.println("sum: " + sum);
            double avg = (double) sum/n;
        System.out.println("average of array is: " + avg);
            return avg;
    }
}