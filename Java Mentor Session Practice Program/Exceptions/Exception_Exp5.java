package Exceptions;
import java.io.*;
public class Exception_Exp5 {
    public static void main(String[] args) {
        char [] array=new char[50];
        try{
            FileInputStream obj=new FileInputStream("D:\\java2.txt");
            InputStreamReader obj1=new InputStreamReader(obj);
            obj1.read(array);
            System.out.println(array);
            obj1.close();
        }
        catch(Exception e){
            e.getStackTrace();
        }
    }
}
