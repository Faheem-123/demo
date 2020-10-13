class calculator
{
	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER THE FIRST VALUE"); 
	int input =sc.nextInt();
	System.out.println("ENTER THE SECOND VALUE");
	int input1=sc.nextInt();
	int input2=input+input1;
	System.out.println("YOUR VALUE IS" +input2);
}
}
