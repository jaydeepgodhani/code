class Box
{
	double height, width, depth;
	Box() //constructor is normally setting up to set the value of instance variable
	{
		System.out.println("setting value automatic");
		height = 10;
		width = 20;
		depth = 30;
	}
	Box(double height, double width, double depth)
	{
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	double volume()
	{return height*width*depth;}
	/*void setdim(double h, double w, double d)
	{
		width = w;
		height = h;
		depth = d;
	}*/
	protected void finalize()//we cant know when this mathos is getting executed :(
	{
		System.out.println("finalize... gets executed just before going to destroy");
	}
}
class boxdemo2
{
	public static void main(String args[])
	{
		Box b1 = new Box(); //...Box() ...this line call default constructor, that set all the instance variable to zero
		Box b2 = new Box(); //but in this case customized constructor is used so default con is no longer used
		Box b3 = new Box(23,32,13);
		//b1.setdim(10,20,30);
		//b2.setdim(20,30,40);
		double vol1=b1.volume(), vol2=b2.volume(), vol3=b3.volume();
		System.out.println("Volume of the box1 is : "+vol1);
		System.out.println("Volume of the box2 is : "+vol2);
		System.out.println("Volume of the box2 is : "+vol3);
	}
	//overloaded method must be differ by type of parameters and/or number of parameters(beware of automatic type conversion only if no exact match is found)
	
}