package dz1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dz1_2 {
	
	public static void main(String ... args) {
		int countOfNumbers = 0;
		for(int i = 0; i < 10; i++) {
			if(!validateNum(generateNum(100000))) countOfNumbers += 1;
		}
		System.out.println("Количество: "+countOfNumbers);
	}

	public static boolean validateNum(String number) {
		Pattern pat = Pattern.compile("\\d*(?<num>[02468]{3})\\d*");
		Matcher mat = pat.matcher(number);
		System.out.print(number);
		if(mat.matches()) {
			System.out.print(" - фрагмент ["+mat.group("num")+"]");
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
