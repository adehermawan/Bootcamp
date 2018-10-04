package com.mitrais.app;
import java.io.*;
abstract class Shape {
	String objectname = "";
	
	Shape(String name) {
		this.objectname = name;
	}
	
	public void moveTo(int x, int y) {
		System.out.println(this.objectname + " "+"has been moved to"+" X = "+x+"and y = "+ y);
	}
	
	abstract public double area();
	abstract public void draw();
	
}

class Rectangle extends Shape 
{
int length,width;
Rectangle(int length, int width, String name) {
	// TODO Auto-generated constructor stub
	super(name);
	this.length = length;
	this.width = width;
	
}
@Override
public double area() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public void draw() {
	// TODO Auto-generated method stub
	
}
}
