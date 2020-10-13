class Faculty
{
int fac_id;
String fac_name;
void display()
{
System.out.println(fac_id);
System.out.println(fac_name);
}
public static void main(String args[])
{
Faculty f1=new Faculty();
f1.fac_id=14;
f1.fac_name="Zarar";
f1.display();
Faculty f2=new Faculty();
f2.fac_id=10;
f2.fac_name="Hussain";
f2.display();
}
}


