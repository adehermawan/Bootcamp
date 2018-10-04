package com.mitrais.app;

interface MyName{
	String computeName(String str);
}

interface NumericTest{
	boolean computeTest(int n);
}


public class Lambda {
	public static void main(String[] args) {
		NumericTest isEven = (n)->(n%2) == 0;
		
	}
}
