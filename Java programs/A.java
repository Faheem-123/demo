class Two
{public static void main(String args[])
{int i,,j,k=0;
for(i=0;i<4;;i++)
for(j=0;j<5;;j++){
Two[i][j]=k;
k++;}
for(i=0;i<4;;i++){
for(j=0;j<5;;j++)
System.out.println(Two[i][j] +" ");
System.out.print();}}