package com.mitrais.app;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import com.mitrais.app.*;
public class JavaBasic {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
    	

    	// understand usage of data types(object vs primitive) and how to use them
    	/*
    	int num = 1;
    	byte a = 100;
    	char name = 'A';
    	boolean result = false;
    	
    	String str;
    	str = new String("Hello Guys!!");
    	System.out.println(str);
    	*/
    	// able to create and using object
    	/*
    	Cats myCat = new Cats("Uvi");
    	System.out.println(myCat);
    	*/
    	
    	// understand available operators and able to use correct operators for each data types
    	/*
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("b--   = " +  (b--) );

        */
    	
    	// understand how to use arrays
    	/*
        List<String> employee = new ArrayList<>();
        employee.add("rendi");
        employee.add("randu");
        employee.add("rindu");
        employee.add("rondo");
        
        System.out.println("First employee: " + employee.get(0));
        System.out.println("All employee: " + employee);
        System.out.println("Number of employee: " + employee.size());
        System.out.println("Contains 'rindu'?" + employee.contains("rindu"));

        employee.remove(1);
        System.out.println("All employee: " + employee);

        for (String element : employee) {
        	System.out.println(element);
        }
    	
        Iterator<String> iterator = employee.iterator();
        while (iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        employee.forEach(System.out::println);
        */
    	// able to use conditional construct (if, else)
    	/*
    	int a = 9;
    	
    	if (a % 2 == 1) {
    	System.out.println("Ganjil");	
    	}else {
    		System.out.println("Genap");
    	}
    	*/
    	
    	// able to use loop construct (while, do-while, for)
    	/*
    	int a = 0;
    	
    	while(a<10) {
    		System.out.println(a);
    		a++;
    	}
    	
    	do {
    		System.out.println(a);
    		++a;
    	}while(a<10);
    	*/
    	// ========= able to create and use method
    	// Return Method
    	/*
    	int maxVal = maxVal(10, 11);
    	System.out.println("Maximum value = "+maxVal);
    	*/
    	// Non Return Method
    	// rankPoints(255.7);
    	// ========= understand override and overload method
    	/*
    	JavaBasic js = new JavaBasic();
    	 js.testZoneDateTime();
    	 */
    	/*
    	Map<Integer, String> mapHttpErrors = new HashMap<>();
    	mapHttpErrors.put(400, "Bad Request");
    	mapHttpErrors.put(304, "Not Modified");
    	mapHttpErrors.put(200, "OK");
    	mapHttpErrors.put(301, "Moved Permantently");
    	mapHttpErrors.put(500, "Internal Server Error");
    	
    	System.out.println(mapHttpErrors);
    	String status301 = mapHttpErrors.get(301);
    	System.out.println("301: "+status301);
    	mapHttpErrors.replace(304, "No Changes");
    	System.out.println("Map after: "+mapHttpErrors);
    	
    	
    	Set<String> names = new HashSet<>();
    	names.add("Tom");
    	names.add("Merry");
    	names.add("Peter");
    	names.add("Alice");
    	
    	System.out.println(names);
    	System.out.println("set size: "+names.size());
    	names.remove("Merry");
    	System.out.println(names);
    	System.out.println("set size: "+names.size());
    	if (names.contains("Alice")) {
			System.out.println("Found Alice");
		}
    	*/
    	
    	Stack st = new Stack();
    	System.out.println("stack: "+st);
    	showpush(st, 42);
    	showpush(st, 66);
    	showpush(st, 99);
//    	showpop(st);
    	//showpop(st);
//    	showpop(st);
    	try {
			showpop(st);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
    }
    
    static void showpush(Stack st, int a) {
    	st.push(new Integer(a));
    	System.out.println("push("+a+")");
    	System.out.println("stack: "+st);
    }
    
    static void showpop(Stack st) {
    	System.out.println("pop -> ");
    	Integer a= (Integer) st.pop();
    	System.out.println(a);
    	System.out.println("stack: "+st);
    }
    
    public void testLocalDateTime() {
    	LocalDateTime currentTime = LocalDateTime.now();
    	 System.out.println("Current DateTime: "+ currentTime);
    	 
    	 LocalDate date1 = currentTime.toLocalDate();
    	 System.out.println("date1: " + date1);
    	 
    	 Month month = currentTime.getMonth();
    	 int day = currentTime.getDayOfMonth();
    	 int seconds = currentTime.getSecond();
    	 System.out.println("Month: "+month+" day: "+day+"seconds: "+seconds);
    	 
    	 LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2012);
    	 System.out.println("date2: "+date2);
    	 
    	 LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 12);
    	 System.out.println("date3: "+date3);
    	 
    	 LocalTime date4 = LocalTime.of(22, 15);
    	 System.out.println("date4: "+date4);
    	 
    	 LocalTime date5 = LocalTime.parse("20:15:30");
    	 System.out.println("date5: "+date5);
    }
    
    public void testZoneDateTime() {
    	ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
    	System.out.println("date1: "+ date1);
    	
    	ZoneId id = ZoneId.of("Europe/Paris");
    	System.out.println("ZoneId: "+id);
    	
    	ZoneId currentZone = ZoneId.systemDefault();
    	System.out.println("CurrentZone: "+currentZone);
    }
    /*
    public static int maxVal(int n1, int n2) {
    	
    	int max;
    	if (n1 > n2) 
    		max = n1;
    	else
    		max =n2;
    	return max;
    	
    }
    
    public static void rankPoints(double points) {
    	if (points >= 202.5) {
    		System.out.println("Rank:A1");
    	}else if (points >= 122.4) {
    		System.out.println("Rank:A2");
    	}else {
    		System.out.println("Rank:A3");
    	}
    	
    }
    */

	private static String currentTime() {
		// TODO Auto-generated method stub
		return null;
	}

}

abstract class Example11{
	private int numOne=10;
	protected final int numTwo=20;
	public static final int numThree=500;
	public void display() {
		System.out.println("Num1="+numOne);
	}
}

class Contoh11 extends Example11{
	public void display2() {
		System.out.println("Num2="+numTwo);
		System.out.println("Num3="+numThree);
	}
}

interface Example1{
	public void display1();
}
interface Example2{
	public void display2();
}

interface Example3 extends Example1,Example2{
}
class Example4 implements Example3{

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println("display1 method");
		
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("display2 method");
		
	}
	
}

abstract class Example7{
	protected abstract void display1();
	public abstract void display2();
}
class Testing extends Example7{

	@Override
	protected void display1() {
		// TODO Auto-generated method stub
		System.out.println("display1 method");
		
	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println("display2 method");
		
	}
	
}

interface Contoh{
	void display1();
}
class TesContoh implements Contoh{

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		
	}}
/*
 // demo abstract class
class Example1{
	public void display1() {
		System.out.println("display1 method");
	}
}

abstract class Example2{
	public void display2() {
		System.out.println("display2 method");
	}
}

abstract class Example3 extends Example1{
	abstract void display3();
}

class Example4 extends Example3{

	@Override
	void display3() {
		System.out.println("display3 method");
		// TODO Auto-generated method stub
		
	}}
*/