//write a program to cheak its palindrome or not
class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		int num=142;
		int dup=num;
		int rev=0;
		
		int rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
		rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
		rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
		

	 if (dup==rev)
	 { 
		 System.out.println("Its a Palindrome");
	 }
	 else
    {
		System.out.println("Its not a palindrome");
	}
	
  }
}
