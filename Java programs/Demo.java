class Test
{
int a,b;
Test(int i,int j)
{
a=i;
b=j;
}
void meth(Test o)
{
a=o.a;
b=o.b;
System.out.println(a +" "+b);}
}
class CallTest
{
public static void main(String args[])
{
Test ob=new Test(15,20);
System.out.println("Before"+ob.a +" "+ob.b);
ob.meth(ob);
System.out.println("After"+a +" "+b);
}

}