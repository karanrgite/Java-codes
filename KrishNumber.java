import java.util.Scanner;
class KrishNumber 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=sc.nextInt();
		int dup=num;
		int sum=0;
		 
		 while (num>0)
		 {
			 int rem=num%10;
			 int fact=1;
			 for (int i=1;i<=rem ;i++ )
			 {
				 fact*=i;
			 }
			 sum+=fact;
			 num/=10;
		 }
		 
		System.out.println(sum==dup?dup+ "Its a KrishNumber": dup+ "Its not a Krish Number");
	}
}
