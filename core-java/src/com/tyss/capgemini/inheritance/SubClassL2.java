package com.tyss.capgemini.inheritance;

public class SubClassL2 extends SubClassL1 {
	@Override
	public String print() {
		System.out.println("Overridden print() in subClassL2");
		return super.print();

	}

	@Override
	public void display() {
		super.display();
		 super.i=12;
		System.out.println("Overridden display() in subClassL2");
	}
   
	public static void main(String[] args) {
		SubClassL2 subClassL2 = new SubClassL2();
		subClassL2.display();
		System.out.println(subClassL2.print());
		System.out.println("Integer i of superCLass : " + subClassL2.i);// This is taken or inherited from superClass
																		// using the subClassL2 reference
		// Super will not be used with a static keyword and super variables changes should
		// be done inside a method of a class, NOT outside
	}

}
