//Hierarchical inheritance
//parent class
class Teacher {
    void specialization() {
        System.out.println("MATHS & Statistics");
    }
}
//child class1
class Student1 extends Teacher{
    void Maths(){
        System.out.println("To learn maths");
    }
}
//child class2
class Student2 extends Teacher{
    void Statistics(){
        System.out.println("To learn Statistics");
    }
}

public class Inheritance_Hierarchical {
    public static void main(String[] args) {
        Student2 s2=new Student2();
        s2.Statistics();
        s2.specialization();
        Student1 s1=new Student1();
        s1.Maths();
        s1.specialization();

    }
}
