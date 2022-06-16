package encapsulation;
class Employee {
    private String empname;
    private int empid;
    private String empdepartment;

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String name) {
        this.empname = name;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int id) {
        this.empid = id;
    }

    public String getEmpdepartment() {
        return empdepartment;
    }

    public void setEmpdepartment(String deprt) {
        this.empdepartment = deprt;
    }

}
   class Employee_Main {
       public static void main(String[] args) {
           Employee obj1 = new Employee();
           obj1.setEmpname("Rahul Kumar");
           obj1.setEmpid(48795);
           obj1.setEmpdepartment("Jr. Executive IT");
           System.out.println(obj1.getEmpname());
           System.out.println(obj1.getEmpid());
           System.out.println(obj1.getEmpdepartment());
       }
   }

