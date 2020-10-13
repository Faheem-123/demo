class OperatorExample{  
public static void main(String args[]){  
short a=10;  
short b=10; 
int c; 
//a+=b;//a=a+b internally so fine  
c=a+b;//Compile time error because 10+10=20 now int  
System.out.println(c);  
}}  