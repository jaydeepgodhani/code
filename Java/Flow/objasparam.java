class Test
{
	int a,b;
	Test(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	boolean equal(Test o) //parameter type is class type
	{
		if(this.a == o.a && this.b == o.b) //this method is useful when you want new object as existing one 
			return true; // and that can be achieved by constructor + obj as param
		else
			return false;// primitive types are passed by call-by-value, object is passed by call-by-reference
	}
}
class objasparam
{
	public static void main(String args[])
	{
		Test t1 = new Test(2,5);
		Test t2 = new Test(2,5);
		Test t3 = new Test(9,1);
		System.out.println("obj 1 = obj 2 ? : "+t1.equal(t2)); //passing whole object as parameter
		System.out.println("obj 1 = obj 3 ? : "+t1.equal(t3));
	}
}
//return object
//recursion