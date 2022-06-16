public class Practice_Exp2 {
        //declaring variables
        int emp_id;
        String emp_name;
        double emp_salary;
        static String company="ITC";
        //constructor accepting single value
        Practice_Exp2(int emp_id,String emp_name,double emp_salary) {
            this.emp_id=emp_id;
            this.emp_name=emp_name;
            this.emp_salary=emp_salary;
        }
        void display() {
            System.out.println(emp_id +" " +emp_name +" " +emp_salary +" "+ company);
        }
        static void abc(){
            company="TCS";
    }
        public static void main(String[] args) {
            //call constructor by passing a single value
            Practice_Exp2 emp1=new Practice_Exp2(234,"Siva",40000);
            Practice_Exp2 emp2=new Practice_Exp2(241,"Mrunal",78405);
            Practice_Exp2 emp3=new Practice_Exp2(287,"Mukthesh",58504);
            Practice_Exp2.abc();
            /*Practice_Exp2.company="HCL";*/
            emp1.display();

        }
    }

