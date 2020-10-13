class Box
{
	double width;
	double height;;
	double depth;
	public void show(width w,height h,depth d)
{
	width=w;
	height=h;
	depth=d;
	System.out.println(width  +"  " +height +" " +depth);
	
	}
	public static  void main(String args[])
	{
		Box mybox=new Box();
		mybox.show(90,37,29);
	}

}

		