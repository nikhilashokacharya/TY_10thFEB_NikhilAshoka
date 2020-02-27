package com.tyss.capgemini.operators;

public class ArithmeticOperators {
  static int i=5;
	public static void main(String[] args) {
        
		i=15;
		int i=97;//dec and assigning
         int j= 45;//dec and assigning
         int sum=i+j;//dec and assigning
         int sub=i-j;//dec and assigning
         int mul=i*j;//dec and assigning
         double div=i/j;//dec and assigning
         int mod=i%j;//dec and assigning
         
         System.out.println("Sum: "+sum); 
         System.out.println("Sub:"+sub);
         System.out.println("mul:"+mul);
         System.out.println("div:"+div);
         System.out.println("sub new value:"+(j-i));
         System.out.println("rem:"+mod);
         System.out.println(10+20+"Hello");

         //ArithmeticOperators a = new ArithmeticOperators();
         main();
	}
	
       public static void main()
	{
		System.out.println("2nd main method");
	}

}
