package com.mitrais.app;

public class Outer_Demo {
	int num;
	
	// ineer class
	private class Inner_demo {
		public void print() {
			System.out.println("This is an inner class");
		}
	}
	
	// Accessing heinner class from the method within
	void display_Inner() {
		Inner_demo inner = new Inner_demo();
		inner.print();
	}
}


