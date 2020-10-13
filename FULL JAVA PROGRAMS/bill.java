class Bill
{
public static void  main(String args[])
{
double bill=150;
if(bill>0 && bill<=100){
bill=bill*5;
System.out.println(bill);
}
else if (bill>=100 && bill<=200)
{
bill=(100*5)+(bill-100)*10;
System.out.println(bill);
}
else if(bill>=200 && bill<300)
{
bill=(100*5)+(100*10)+(bill-200)*20;
System.out.println(bill);
}
}
}