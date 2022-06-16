public class Polymorphism_Exp2{
    static String animal(String a,String b){
        String c=a+b;
        return c;
    }
     static String animal(String a, String b,String c,String d){
        String e=a+b+c+d;
        return e;
     }

    public static void main(String[] args) {
        System.out.println(Polymorphism_Exp2.animal("Dog","Cat"));
        System.out.println(Polymorphism_Exp2.animal("Rhino","Elephant","Lion","Tiger"));
    }
}
