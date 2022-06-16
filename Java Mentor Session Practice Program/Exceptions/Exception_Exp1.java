package Exceptions;

public class Exception_Exp1 {
    public static void main(String[] args) {
        try{
            int divide=100/0;
            System.out.println("division");
        }
        catch (ArithmeticException e){
            System.out.println("error is occurred ");

        }
        finally{
            System.out.println("finally rectified");
        }
    }
}
