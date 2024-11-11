class LeapYear 
{
	public static void main(String[] args) 
	{
		int year= 2020;
		String op = ((year%4==0 && year%100!=0)||(year%400==0))?
			(year+ ":Its a Leap Year"):
			(year+ ":Its not a Leap Year");
		System.out.println(op);
	}
}


/**
 class LeapYear {
    public static void main(String[] args) {
        int year = 5000;
        String op = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            ? (year + ": It's a Leap Year")
            : (year + ": It's not a Leap Year");
        System.out.println(op);
    }
}
*/