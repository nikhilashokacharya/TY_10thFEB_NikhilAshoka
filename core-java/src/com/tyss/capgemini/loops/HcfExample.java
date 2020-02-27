package com.tyss.capgemini.loops;

public class HcfExample 
{
	public static void main(String[] args) 
	{
		int a=810,b=900,num=0;
		for (int i = 1; ((i <= a)&&(i<=b)); i++) 
		{
			
			if((a%i==0)&&(b%i==0))
			{
				 num= i;
			}
		}
		System.out.println(num);
	}

}
