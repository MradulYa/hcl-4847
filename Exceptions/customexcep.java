package Exceptions;
class InvalidAgeExcemption extends Exception{
    InvalidAgeExcemption(String msg) {
        super(msg);
        System.out.println("underage");
    }
}
public class customexcep{
    public static void main(String[] args) {
        int age=16;

    try{
        age=16;
        if(age<18){
            throw new InvalidAgeExcemption("underage");
        }
        else{
            System.out.println("valid age");
        }
    }
    catch(InvalidAgeExcemption e) {
        System.out.println("Invalid age exception" + " "+e.getMessage());
    } }
}
