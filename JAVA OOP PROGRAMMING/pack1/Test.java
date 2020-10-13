package pack1;
class Test
{
protected int val=100;
public void disp()
{
System.out.println("class Test");
System.out.println("Value="+val);
}
}
import Pack1.Test;
class Sub extends Test
{
int n=200;
void dispSub()
{
System.out.println("class Sub");
System.out.println("Val="+val);
System.out.println("n="+n);
}
}
class Main
{
public static void main(String args[])
{
Sub ob=new Sub();
ob.disp();
ob.dispSub();
}
}
