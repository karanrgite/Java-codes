//Write a program to find count of digit
class CountDigit 
{
	public static void main(String[] args) 
	{ 
		int num= 234;
		int count= 0;
		
		int rem= num%10;
	    count=count+1;
		num=num/10;
		rem=num%10;
		count=count+1;
		num=num/10;
		rem=num%10;
		count=count +1;
		
			
			
		System.out.println(count);
	}
}
