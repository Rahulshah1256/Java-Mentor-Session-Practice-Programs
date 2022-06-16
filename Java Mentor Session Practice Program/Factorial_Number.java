public class Factorial_Number {
   
     public static void main(String[] args) {
 		int num=5,factorial=1;
 	      for(int i=1;i<=num;++i){
 	          //factorial=factorial*i;
 	          factorial*=i;
 	      }
 	      System.out.println("Factorial:" +factorial);

    }
}
