import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{  Scanner sc = new Scanner (System.in);
	System.out.print("Enter The Number :");
	int num = sc.nextInt();
	  if (isprime(num))
		{
		  System.out.println(num+" Its A prime Number ");
		}
		else 
		{
			System.out.println(num+ "  Its not A Prime Number ");
		}
	}
	public static boolean isprime(int num)
	{
		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				return false;
			}
			
		}
		return true;
	}
		
}
