class UseStatic//static can be called before any object exist(as a global variable) only one copy throught the program
{
	static int a = 3; //as soon as static class is loaded all static statementare run, first a is set to 3
	static int b; //then static block is executed, then main is called and passed 42 to x
	static void math(int x)
	{
		System.out.println("a is : "+a); //static method only can call other static method
		System.out.println("b is : "+b); //they must only access static data
		System.out.println("x is : "+x); //they cannot use THIS and SUPER in any way
	}
	static //static block mostly used for initialize static data
	{
		System.out.println("static block initialized");
		b=a*4;
	}
	public static void main(String args[])
	{
		math(42); //if static variable or methods are in other class then classname.methodname is the way to call it
	}
}