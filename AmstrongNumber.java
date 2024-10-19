class AmstrongNumber 
{
	public static void main(String[] args) 
	{
		int num=153;
		int dup=num;
		int dup1=num;
		int count=0;
		int sum=0;
		while(num>0)
			count++;
		    num/=10;
	
	 while(dup>0)
	{
		int rem=dup%10;
		int op=1;
		for (int i=1;i<=count ;i++ )
		{
			op=op*rem;
		}
		sum +=op;
		dup/=10;
	}
	if (dup1==num)
	{
		System.out.println(dup1+"Its a Amstrong");
	}
	else 
		System.out.println(dup1+"Its not a Amstrong");
	}
	
}
