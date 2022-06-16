package Exceptions;
import java.io.*;
public class Exception_Exp2 {
    public static void main(String[] args) {
        try {
            FileOutputStream obj1 = new FileOutputStream("D:\\java1.txt");
            String C="welcome";
            byte b[]=C.getBytes();
            obj1.write(b);
            obj1.write(98);
            obj1.close();
            System.out.println("Byte");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
