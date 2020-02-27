package com.tyss.capgemini.inheritance;

public class SubClassL1 extends SuperClass{
	//@Override is a marker interface. Which Just provides additional information to a method/variable or Class as well.
	@Override
	public String print() {
		return "Some other String";
		
	}
	public void display() {
		System.out.println("display() of subClass");
	}
	
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		SubClassL1 subClassl1 = new SubClassL1();
		SuperClass subClass1 = new SubClassL1();//up-casting
		SubClassL1 SubClassl12 = (SubClassL1) subClass1;//down-casting
		
		
		System.out.println(superClass.print());
		System.out.println(subClassl1.print());
		System.out.println(subClass1.print());
		subClassl1.display();
	}
	}
	
	

