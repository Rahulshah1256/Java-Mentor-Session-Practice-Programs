package javaproj123;
interface comic{
    void read();
}
class thriller implements comic{
    public void read(){
        System.out.println("Thriller genre comics");
    }
}
class action implements comic{
    @Override
    public void read() {
        System.out.println("Action genre comics");
    }
}
public class Interface_Exp2 {
    public static void main(String[] args) {
        comic ep1=new action();
        ep1.read();
        comic ep2=new thriller();
        ep2.read();
    }
}
