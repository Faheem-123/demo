class CheckNote
{
public static void main(String args[])
{
int no=2860;
System.out.println("Thousand Note:"+no/1000);
no%=1000;
System.out.println("Five Hundered Note:"+no/500);
no%=500;
System.out.println("Hundered Note:"+no/100);
no%=100;
System.out.println("fifity Note:"+no/50);
no%=50;
System.out.println("Ten Note:"+no/10);
no%=10;
}
}
