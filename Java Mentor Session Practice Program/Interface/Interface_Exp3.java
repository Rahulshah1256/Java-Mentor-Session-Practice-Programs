package javaproj123;
interface movie{
    void watch();
}
interface series {
    void watch2();
}
class premium implements movie,series{
    @Override
    public void watch() {
        System.out.println("Premium movies");
    }
    public void watch2(){
       System.out.println("Premium series");
    }
}
public class Interface_Exp3 {
    public static void main(String[] args) {
        premium season1=new premium();
        season1.watch();
        season1.watch2();
    }
}
