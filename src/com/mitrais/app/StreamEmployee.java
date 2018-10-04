package com.mitrais.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.print.attribute.standard.NumberUpSupported;

public class StreamEmployee {
	public static void main(String[] args) {
		System.out.println("Using java 7: ");
		
		// count empty string
		List<String> strings = Arrays.asList("abc","","bc","efg","","jkl");
		System.out.println("List: "+strings);
		
		long count = getCountEmptyStringUsingJava7(strings);
		System.out.println("Empty String: "+count);
		
		count = getCountLengthUsingJava7(strings);
		System.out.println("String of length 3: "+count);
		
		// Eliminate empty string
		List<String> filtered = deleteEmptyStringUsingJava7(strings);
		System.out.println("Filtered List: "+filtered);
		
		// Eliminate empty string and join using comma
		String mergedString = getMergedStringUsingJava7(strings,",");
		System.out.println("Merged String: "+mergedString);
		List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
		
		// get list of square of distinct number
		List<Integer> squaresList = getSquares(numbers);
		System.out.println("Squares List: "+squaresList);
		List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
		
		System.out.println("List: "+integers);
		System.out.println("Highest number in List : "+getMax(integers));
		System.out.println("Minimum number in List : "+getMin(integers));
		System.out.println("Summary number : "+getSum(integers));
		System.out.println("Average : "+getAverage(integers));
		
		System.out.println("Using Java 8");
		System.out.println("==============");
		
		System.out.println("List: "+strings);
		
		count = strings.stream().filter(string->string.isEmpty()).count();
		System.out.println("Empty String: "+count);
		
		count = strings.stream().filter(strong -> strong.length() == 3).count();
		System.out.println("String of length 3: "+ count);
		
		List<String> filtered2;
		filtered2 = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List: "+filtered);
		
		String mergedString2;
		mergedString2 = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: "+mergedString2);
		
		List<Integer> squareList2;
		squareList2 = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
		System.out.println("Squares List: "+squareList2);
		System.out.println("List: "+integers);
		
	}


	private static int getAverage(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return getSum(numbers)/numbers.size();
	}


	private static int getSum(List<Integer> numbers) {
		// TODO Auto-generated method stub
		int sum = (int)(numbers.get(0));
		
		for(int i = 1; i<numbers.size();i++) {
			sum += (int)numbers.get(i);
		}
		return sum;
	}


	private static int getMin(List<Integer> numbers) {
		// TODO Auto-generated method stub
		int min = numbers.get(0);
		
		for(int i=1;i< numbers.size();i++) {
			Integer number = numbers.get(i);
			
			if (number.intValue() < min ) {
				min = number.intValue();
			}
		}
		return min;
	}


	private static int getMax(List<Integer> numbers) {
		// TODO Auto-generated method stub
		int max = numbers.get(0);
		
		for (int i=1;i < numbers.size();i++) {
			Integer number = numbers.get(i);
			
			if (number.intValue() > max) {
				max = number.intValue();
			}
			
		}
		return max;
	}


	private static List<Integer> getSquares(List<Integer> numbers) {
		// TODO Auto-generated method stub
		List<Integer> squaresList = new ArrayList<Integer>();
		
		for (Integer number: numbers) {
			Integer square = new Integer(number.intValue() * number.intValue());
			
			if (!squaresList.contains(square)) {
				squaresList.add(square);
			}
		}
		return squaresList;
	}


	private static String getMergedStringUsingJava7(List<String> strings, String sparator) {
		// TODO Auto-generated method stub
		StringBuilder stringBuilder = new StringBuilder();
		for(String string: strings) {
			if (!string.isEmpty()) {
				stringBuilder.append(string);
				stringBuilder.append(sparator);
			}
		}
		String mergedString = stringBuilder.toString();
		return mergedString.substring(0, mergedString.length()-2);
	}


	private static List<String> deleteEmptyStringUsingJava7(List<String> strings) {
		// TODO Auto-generated method stub
		List<String> filteredList = new ArrayList<String>();
		for(String string: strings) {
			if (!string.isEmpty()) {
				filteredList.add(string);
			}
		}
		return filteredList;
	}

	private static long getCountLengthUsingJava7(List<String> strings) {
		// TODO Auto-generated method stub
		int count=0;
		
		for (String string: strings) {
			if (string.length() == 3) {
				count++;
			}
		}
		return count;
	}

	private static long getCountEmptyStringUsingJava7(List<String> strings) {
		// TODO Auto-generated method stub
		int count =0;
		for(String string: strings) {
			if (string.isEmpty()) {
				count++;
			}
		}
		return count;
	}
	
}
