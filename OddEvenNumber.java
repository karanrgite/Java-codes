import java.util.Scanner;
class  OddEvenNumber
{
	public static void main(String[] args) 
	{ Scanner Sc= new Scanner (System.in);
	    System.out.println("Eneter The Num1 :");
	   int num = Sc.nextInt();
		
	   if (num%2==0)
	   {
			System.out.println("Its A Even number");
	   }
	   if (!(num%2==0))
	   {
		   System.out.println("its A Odd Number");
	   }
		
	}
}
