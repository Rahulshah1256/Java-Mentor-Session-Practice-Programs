
public class Polymorphism_Exp1 {
    static int  sub(int a, int b){
        int c= a+b;
        return c;
    }
    static double sub(double a,double b, double c ){
        double d= a+b+c;
        return d;
    }
    public static void main(String[] args) {
        System.out.println(Polymorphism_Exp1.sub(10,11));
        System.out.println(Polymorphism_Exp1.sub(20900,32465,63244));
    }
}
