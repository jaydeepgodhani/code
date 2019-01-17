class example
{
	public static void main(String args[])
	{
		int a=0, b, num = 215;
		byte bt;
		//Float = 3.57F;
		//09 means it's an OCTAL number so 07 is possible but not beyond that
		//int a = 09; //this is error
		int ob = 07; //this is octal no 7
		char c = '\141', d = 103, e = '\u0061'; // octal 141 and hexa u0061 means 'a'

		System.out.println("Hello there"+num +ob +c +d +e);
		int bar =3;
		{
			//int bar = 2; bar already defined error
			int bad = 3;
		}
		int bad = 6; // this works fine because defined after blank scope
		bt = (byte) num;
		System.out.println("byte from integer" + bt); //answer : -41 bcs 1 to 127 and -128 to -41 (small to big)

		//bt = bt * 2; //ErRoR bcs atomatically promoted to int and final result is in int
		bt = (byte) (bt * 2); //this works fine now.

		int ary[];
		ary = new int[5];

		if (a != 0)// if (a) ...this worked in C/C++ but not in here
		{
			System.out.println("Something");
			// && and || is useful when only left side op is necessary for the result
			if (a != 0 && num/a >10); // && is useful when right depends on left, here if we use single & then if a is zero then it causes runtime exception
			if(c == 1 & (d++ < 100)); //here & is neccessory bcs whether c is 1 or not d++ has to happen
			//break; ...this wont work, break outside switch or loop
		}

		for(a=1, b=6; a<b; a++, b--)
		{
			System.out.println("\n\n\n a = " + a);
			System.out.println(" b = " + b);
		}
		//for each loop ...obtain the value from collections
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		for(int x: nums) sum += x; // in the array int type values are there so int x
		//if two dim array given then for(int x[] :nums){ for(int y: x) {...}}
		System.out.println("for each sum is : "+sum);

		boolean t = true;
		first: // first: for(int i=0; i<3; i++) is also valid
		{
			second: //to break the labelled block 'break' must be in the block (enclosed)
			{
				third:
				{
					System.out.println("Before the break.");
					if(t) break second; // break out of second block ...like this 'continue label' is also used
					System.out.println("This won't execute");
				}
			System.out.println("This won't execute");
			}	
		System.out.println("This is after second block.");
		}
	}
}