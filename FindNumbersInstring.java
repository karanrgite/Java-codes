import java.util.Scanner;
class FindNumbersInstring
{
	public static void main(String[] args) 
	{Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Word:");
		String ch=sc.next().charAt();
		
		if (!(ch>=65 && ch<=90 )||(ch>=97 &&ch<=122))
		{
			System.out.println("Its a Alphabet or Special Character");
		}else if (ch>=47 && ch<=57)
		{
			System.out.print(ch);
		}
	}
}
