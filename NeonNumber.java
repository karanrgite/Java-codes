class NeonNumber 
{
	public static void main(String[] args) 
	{
		int num=9;
		int sqr=num*num;
		int sum=0;
		while (sqr>0)
		{
			
			sum+=(sqr%10);
			sqr/=10;
			
			
		}
		if (sum==num)
		{
			System.out.println("its a Neon Number");
		}
		else
		System.out.println("Its not a Neon Number");
	}
}
