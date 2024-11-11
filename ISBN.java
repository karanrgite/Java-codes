class ISBN
{
	public static void main(String[] args) 
	{
		long num=1259060977;
		long num1=num;
		int pos=1;
		long sum=0;
		
		while (num>0)
		{
			long rem= num%10;
			sum+=(rem*pos++);
			num/=10;
		}
			System.out.println((sum%=11)==0)?"Its a ISBN Number":"Its not a ISBN Number" );
	}
}
