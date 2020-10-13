class ThrowsDemo
{
static void throwOne()
{
try{
System.out.println("Inside throwOne.");
throw new RuntimeException("Demo");
}
finally{
}
}
public static void main(String args[])
{
try{
throwOne();
}
catch(RuntimeException e)
{
System.out.println("caught"+e);
}
}
}
