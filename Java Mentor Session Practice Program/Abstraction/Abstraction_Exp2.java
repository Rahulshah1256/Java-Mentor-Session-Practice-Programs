abstract class Lang{
    abstract void nation();
        public void Bhojpuri(){
            System.out.println("Bhojpuri is my native language");
        }
}
class Hindi extends Lang{
    void nation(){
        System.out.println("Hindi is our national language");
    }
}
class English extends Lang{
    void nation(){
        System.out.println("English is mainly used for communication purpose");
    }
}
public class Abstraction_Exp2 {
    public static void main(String[] args) {
        English lang1=new English();
        lang1.Bhojpuri();
        lang1.nation();
        Hindi lang2=new Hindi();
        lang2.Bhojpuri();
        lang2.nation();
    }
}
