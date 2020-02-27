package com.tyss.capgemini.primitivedatatypesandvariables;

public class PrimitiveData {
	byte b1;
	short s1;
	int i1;
	long l1;
	float f1;
	double d1;
	char c1;
	boolean istrue1;
	

	public static void main(String[] args) // throws IOException
	{
		byte b = 12;
		short s = 123;
		int i = 1234;
		long l = 121345L;
		float f = 12345F;
		double d = 123456; // 123456D
		char c = 'a';
		boolean istrue = true;

		// System.out.write("Value of primitive data types:\n".getBytes()); --> We can
		// use this statement if we want to print the statement without using print
		// statement.
		// But we have to use exception concept. either the try, catch block. Or use the
		// throws IOException.

		// System.err.print("This is a message\n"); ---> We can also use this statement
		// to print the message, but it will be printed in red
		
		//System.console().writer().println("Hello"); ----> You will get a run time exception
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(istrue);
		PrimitiveData pd = new PrimitiveData();
		pd.instview();
		// To call a non static method, We have to create an instance of a class(object)
		
	}
	
	public  void instview()
	{
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(c1);
		System.out.println(istrue1);
	}

}
