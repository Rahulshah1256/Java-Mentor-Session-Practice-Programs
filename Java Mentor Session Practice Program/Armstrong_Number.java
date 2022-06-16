
public class Armstrong_Number {

	public static void main(String[] args) {
		int num= 371,temp=num,rem,sum=0;
	     while(num>0){
	         rem = num%10;
	         sum=sum+rem*rem*rem;
	         num=num/10;
	     }
	     if(temp == sum)
	         System.out.println("Armstrong number");
	     else
	         System.out.println("Not an Armstrong number");

	}

}
