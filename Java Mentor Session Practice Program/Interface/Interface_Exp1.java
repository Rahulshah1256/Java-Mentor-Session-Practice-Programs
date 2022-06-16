package javaproj123;
interface cricket{
    void play();
}
public class Interface_Exp1 implements cricket {
    public void play(){
        System.out.println("RCB");
    }
    public static void main(String[] args) {
    	Interface_Exp1 match1=new Interface_Exp1();
        match1.play();
    }
}
