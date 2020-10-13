class Teacher 
{
String designation"Teacher";
String college="Beginnersbook";
void does(){
System.out.println("Teaching");
}
}
public class MathTeacher extends Teacher{
stirng mainSubject="Maths";
public static void main(String args[])
{
Teacher obj=new Teacher();
System.out.println(obj.college);
System.out.println(obj.designation);
System.out.println(obj.mainSubject);
obj.does;

}
