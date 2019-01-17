class Test
{
	int a;
	public int b;
	private int c; //c cant be accessed by code outside of its class
	public void setC(int i)
	{
		this.c = i;
	}
	public int getC()
	{
		return this.c;
	}
}
class AccessTest
{
	public static void main(String args[]) 
	{
		Test ob = new Test();
		ob.a = 10;
		ob.b = 20;
		//ob.c = 30; //error bcs not public
		ob.setC(30);
		System.out.println("Values are : "+ob.a + ob.b + ob.getC());
	}
}