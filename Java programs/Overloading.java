class Box{
double width;}
class BoxDemo{
void change(Box b){
b.width=b.width*2;
}
public static void main(String args[])
{
Box b1=new Box();
b1.width=100;
System.out.println(b1.width);
change(b1);
System.out.println(b1.width);
}
}
