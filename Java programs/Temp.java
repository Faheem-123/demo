class Calculate
{
	public static void main(String args[])
{
	int Maths=65;
	int English=89;
	int totalmarks=200;
	int obtainedmarks=Maths+English;
	System.out.println("Obtainedmarks=" +obtainedmarks);
	int per= obtainedmarks*100/totalmarks;
	System.out.println("Percentage=" +per);
	if(obtainedmarks>150 && obtainedmarks<=200){
	System.out.println("Sooper Dooper");
}
}
}