package com.app;

public class Static_Variable {
	static int count=0;
	Static_Variable()
	{
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		Static_Variable s1=new Static_Variable();
		Static_Variable s2=new Static_Variable();
		
		// TODO Auto-generated method stub

	}

}
