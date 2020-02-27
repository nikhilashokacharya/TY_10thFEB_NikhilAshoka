package com.tyss.capgemini.inheritance;
// Java.lang package is by default imported in all the classes.
import com.tyss.capgemini.methods.ArithmeticOperations;

public class DifferentPackageMethodsExample extends ArithmeticOperations {
public static void main(String[] args) {
	int import_add = ArithmeticOperations.add(4, 7);
	int extends_add= add(5,4);
	// Java.lang--->System Class(PrintStream out---->println())--->imports Java.IO.*
	System.out.println(import_add);
	System.out.println(extends_add);
	
	DifferentPackageMethodsExample differentPackageMethodsExample = new DifferentPackageMethodsExample();
	
	System.out.println(differentPackageMethodsExample);
	System.out.println(differentPackageMethodsExample.toString());
	System.out.println(differentPackageMethodsExample.hashCode());
	
	System.out.println("Add method of Super Class : "+add(7, 6));
	System.out.println("sub method of Super Class : "+sub(7, 6));
	System.out.println("div method of Super Class : "+div(7, 6));
	System.out.println("mul method of Super Class : "+mul(7, 6));
	
	
}
}
