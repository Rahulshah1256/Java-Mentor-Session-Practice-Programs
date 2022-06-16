package encapsulation;
class Car{
    private String carname;
    private double carrate;

    public String getCarname() {
        return carname;
    }
        public void setCarname(String name){
        this.carname=name;
    }

    public double getCarrate() {
        return carrate;
    }

    public void setCarrate(double rate) {
        this.carrate = rate;
    }
}
public class Car_Main {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.setCarname("Fortuner");
        System.out.println(car1.getCarname());
        car1.setCarrate(4500000);
        System.out.println(car1.getCarrate());
    }
}
