class Box
{
	double width;
	double height;
	double depth;
	void volume()
	{
		System.out.println("volume of the box is : "+(width*height*depth));
	}
	double volume1()
	{return width*height*depth;}
}
class boxdemo
{
	public static void main(String args[])
	{
		Box b1 = new Box(); //b1 holds the memory address of actual object
		Box b2 = b1; //here b1,b2 points to the same object .. b1=null; then b2 still point to the object and b2 is null
		double vol; //Box() is a constructor ...it defines what occurs when object of class is created
		b1.width = 10;
		b1.height = 20;
		b1.depth = 15;

		vol = b2.width * b2.height * b2.depth;
		System.out.println("volume of box b2 is : "+vol);
		b1.volume();
		System.out.println("volume of box b1 is : "+ b1.volume1());

		b1.width = 17; //here b1 changes its value so it now references to own different object but b2 remain same
		System.out.println("volume of box b2 is : "+vol);
		b1.volume();
		System.out.println("volume of box b1 is : "+ b1.volume1());
	}
}