class Reverse
{
		public static void main(String args[])
	{	
		int num=175;
		int rem=0;
		int sum=0;
		int store=0;
		while(num>0)
		{
		 rem=num%10;
		 store=store*10+rem;
		 sum=sum+rem;
		 num=num/10;
		}
	System.out.println("Reverse="+store);
	System.out.println("Sum="+sum);
	}
}