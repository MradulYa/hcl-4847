package Exceptions;

public class trycatch {
    public static void main(String[] args) {


        int m = 10;
        int n = 0;
        int[] a={1,2,3,4};
        try {
            System.out.println(a[8]);
            int b= m / n;

            System.out.println(b);

        } catch (ArithmeticException e) {
            System.out.println("error due to divide by 0");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error due to array");
        }

    }
}