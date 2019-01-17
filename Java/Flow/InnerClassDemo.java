class Outer
{
	private int outer_x = 100;
	void Test()
	{
		Inner inner = new Inner();
		inner.Display();
	}
	class Inner
	{
		void Display()
		{
			System.out.println("display outer_x : "+outer_x); //inner class can access outer class' private method and variable
		}
	}
}
class InnerClassDemo
{
	public static void main(String args[]) //args parameter stores command line argument in string object
	{
		Outer outer = new Outer();
		outer.Test();
		for(int i=0 ; i<args.length ; i++)
		{
			System.out.println("args ["+i+"]" +args[i]);
		}
	}
}