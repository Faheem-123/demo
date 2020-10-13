import java.util.*;
class Pump
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Choice");
		int Choice=sc.nextInt();
		if(Choice==1)
		{
		System.out.println("Welcome To Atm");
		




		System.out.println("Enter Your Amount");
		int TotalAmount=sc.nextInt();
		int result;
		int result2;
	
		result=TotalAmount/5000;
		System.out.println("5000 Note="+result);
		result2=TotalAmount%5000;
		System.out.println("Remaining Amount" +result2);
		
		result=result2/1000;
		System.out.println("1000 Note="+result);
		result2=result2%1000;
		System.out.println("Reamining Amount=" +result2);

		}














		if(Choice==2){
		System.out.println("Welcome To Marksheet");

System.out.println("Enter English Marks");
int English=sc.nextInt();

System.out.println("Enter Maths Marks");
int Maths=sc.nextInt();

System.out.println("Enter Islamiyat Marks");
int Islamiyat=sc.nextInt();

System.out.println("Enter Urdu Marks");
int Urdu=sc.nextInt();

System.out.println("Enter Physics Marks");
int Physics=sc.nextInt();

int ObtainedMarks=English+Maths+Urdu+Islamiyat+Physics;
System.out.println("Obtained Marks=" +ObtainedMarks);
System.out.println("Enter Total Marks");
int TotalMarks=sc.nextInt();
float Percentage=((ObtainedMarks*100)/TotalMarks);
System.out.println("Percentage=" +Percentage);


if(Percentage>=90)
{
System.out.println("Grade A");
}

else if(Percentage>=80 && Percentage<90)
{
System.out.println("Grade B");
}

else
{
System.out.println("No Grade");
}

	}





	if(Choice==3)
	{
	System.out.println("Welcome To TrollyLoad");

	System.out.println("Enter Your Trolly Number");
	int no=sc.nextInt();
	System.out.println("Enter Rent Per Trolly");
	int rent=sc.nextInt();	
	int Total=no*rent;
	System.out.println("Total Amount=" +Total);
	System.out.println("Enter Diesel Amount Per Trolly");
	int Diesel=sc.nextInt();
	Diesel=Diesel*no;
	Total=Total-Diesel;
	System.out.println("Remaining Amount="+Total);
	System.out.println("Per Driver Amount");
	int Driver=sc.nextInt();
	Driver=Driver*no;
	Total=Total-Driver;
	System.out.println("Remaining Amount="+Total);
	System.out.println("Tax Paid By Per Trolly");
	int Tax=sc.nextInt();
	Tax=Tax*no;
	Total=Total-Tax;
	System.out.println("Profit Amount="+Total);
	
		}
	}
}