package com.mitrais.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Fileio {

	public static void main(String[] args) {
		// try-catch block
		// trycatchblock();	
		
		// Multiple catch block
		// multiplecatchblock();
		
		// Try with resource
		// trywithresource();
		
		// Create Directory
		creatdir();
	}
	


	private static void creatdir() {
		String dirname = "/tmp/user/java/bin";
		File d = new File(dirname);
		
		// Create directory now
		d.mkdirs();
	}



	private static void trywithresource() {
		try(FileOutputStream fileOutputStream = new  FileOutputStream("abc.txt")){
			String msg = "Welcome to java point";
			byte byteArray[] = msg.getBytes(); // converting string to byte array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly");
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}

	private static void multiplecatchblock() {
		try {
			int arr[]=new int[11];
			arr[10]=10/5;
			System.out.println("First print statement in try block");
		}
		
		catch (ArithmeticException e) {
			System.out.println("Warning: ArtihmeticException");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
		}
		catch (Exception e) {
			System.out.println("Warning: Some other Exception");
		}
		System.out.println("Out of try-catch block ...");
	}

	public static void trycatchblock() {
		int num1, num2;
		
		try {
			num1=0;
			num2=62/num1;
			System.out.println(num2);
			System.out.println("Hey I'm at the end of try block");
		} catch (ArithmeticException e) {
			System.out.println("You should not devided a number by zero");
		}catch (Exception e) {
			System.out.println("Exception occured");
		}
		System.out.println("I'm out of try-catch block in Java");
	}
	
}
