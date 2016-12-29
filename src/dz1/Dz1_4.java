package dz1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dz1_4 {
	
	public static void main(String ... args) {
		int countOfNumbers = 0;
		for(int i = 0; i < 10; i++) {
			if(validateNum(generateNum(10000))) countOfNumbers += 1;
		}
		System.out.println("Количество: "+countOfNumbers);
	}

	public static boolean validateNum(String number) {
		Pattern pat = Pattern.compile("(?<num>[02468]{4,5})");
		Matcher mat = pat.matcher(number);
		System.out.print(number);
		if(mat.matches()) {
			System.out.print(" - число подходит");
		} else {
			System.out.print(" - число не подходит");
		}
		System.out.println();
		return mat.matches();
	}
	
	public static String generateNum(int count) {
		String number = "";
		number += (int)(Math.random()*count*10)+""; 
		return number;
	}
	
}
