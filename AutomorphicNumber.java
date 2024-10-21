import java.util.Scanner;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=sc.nextInt();
		int dup=num;
		int count=0;
		 
		 while (num>0)
		 {
			 count++;
			 num/=10;
		 }
		 int div=1;
		 for (int i=1;i<=count ;i++ )
		 {
			 div=div*10;
		 }
		System.out.println(((dup*dup)%div)==dup?dup+"Its a Automorphic Number":dup+"Its not a Automorphic Number");
	}
}
