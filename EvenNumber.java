import java.util.Scanner;
class EvenNumber 
{
	public static void main(String[] args) 
	{Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		 int num=sc.nextInt();
		for (int i=num;i>0;i/=10)
		{  int rem=i%10;
		 if (rem%2==0)
		 {
			 System.out.println("even numbers:"+rem);
		 }
		}
	}
}
