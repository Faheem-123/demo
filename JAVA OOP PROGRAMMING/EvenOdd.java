class Fabonic
{
public static void main(String args[])
{
int one=0;
int second=1;
int sum=0;
System.out.println(one +" " +second);
for(int i=1;i<=10;i++)
{
sum=one+second;
System.out.println(sum);
one=second;
second=sum;
}
}
}
