
public class Reverse_Number {

	public static void main(String[] args) {
		int a=1234, reversed=0;
	      System.out.println("original number:" +a);
	      while(a!= 0){
	          int digit = a%10;
	          reversed=reversed*10+digit;
	          a/=10;
	      }
	      System.out.println("Reversed number:" +reversed);
	}

}
