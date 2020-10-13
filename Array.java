class Array
{
public static void main(String args[])
{
int a[]={1,3,5};
int b[]={1,2,0};
for(int i=0;i<a.length-1;i++)
{
for(int j=0;j<b.length;j++)
{
if(a[i]!=b[j])
{
System.out.println(a[j] +" ");
}
}
}
}
}
