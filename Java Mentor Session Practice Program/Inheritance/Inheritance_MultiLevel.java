//Multi-level inheritance
class Twowheeler{
    void latest(){
        System.out.println("Latest models");
    }
        }

//parent class
class Bike extends Twowheeler{
    void ride(){
        System.out.println("Exclusive bikes");
    }
}
//child class
class Honda extends Bike {
    void milage() {
        System.out.println("Honda speed bike");
    }

}

public class Inheritance_MultiLevel {
    public static void main(String[] args) {
        Honda bike1=new Honda();
        bike1.milage();
        bike1.ride();
        bike1.latest();
    }
}
