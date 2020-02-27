package com.tyss.capgemini.primitivedatatypesandvariables;

public class VariablesExample {

	// If you want to make use of the static variables inside a static method, We
	// have make these variables as static
	byte sGByte;
	short sGShort;
	int sGInt;
	long sGLong;
	float sGFloat;
	double sGDouble;
	char sGChar;
	boolean sGIsTrue;
	String sGString;

	public static void main(String[] args) {
		byte lByte = 4;
		short lShort = 15;
		int lInt = 25;
		long lLong = 28l;
		float lFloat = 28.05f;
		double lDouble = 45.05;
		char lChar = 'N';
		boolean lIsTrue = true;
		String lString = "Hello";
		System.out.println();
		System.out.println("*****************************");

		// For Global variables, It will display the default values of the datatypes of
		// each variables.
//		System.out.println(sGByte);
//		System.out.println(sGShort);
//		System.out.println(sGInt);
//		System.out.println(sGLong);
//		System.out.println(sGFloat);
//		System.out.println(sGDouble);
//		System.out.println(sGChar);
//		System.out.println(sGIsTrue);
//		System.out.println(sGString);

		// For Local Variables, We have to give a value for the each variable to get a
		// error free code.
		// It is compulsory that we have to initialize the values to the Local
		// variables.
		/*
		 * System.out.println(lByte); System.out.println(lShort);
		 * System.out.println(lInt); System.out.println(lLong);
		 * System.out.println(lFloat); System.out.println(lDouble);
		 * System.out.println(lChar); System.out.println(lIsTrue);
		 * System.out.println(lString);
		 */

		System.out.println(lByte);
		System.out.println(lShort);
		System.out.println(lInt);
		System.out.println(lLong);
		System.out.println(lFloat);
		System.out.println(lDouble);
		System.out.println(lChar);
		System.out.println(lIsTrue);
		System.out.println(lString);

		VariablesExample v = new VariablesExample();
		v.disp();

	}

	public void disp() {
		System.out.println(sGByte);
		System.out.println(sGShort);
		System.out.println(sGInt);
		System.out.println(sGLong);
		System.out.println(sGFloat);
		System.out.println(sGDouble);
		System.out.println(sGChar);
		System.out.println(sGIsTrue);
		System.out.println(sGString);

	}

}
