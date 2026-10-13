package Exceptions;

public class thro {
    public static void age(int a){
        if(a<18){
            throw new ArithmeticException("invalid");
        }
    }
    public static void main(String[] args) {
        age(15);}
}
