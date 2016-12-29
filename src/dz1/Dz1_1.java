package dz1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dz1_1 {
	
	public static void main(String ... args) {
		System.out.println(validateIP("255.255.255.128"));
		System.out.println(validateIP("192.168.105.21"));
		System.out.println(validateIP("192.168.105.0"));
		System.out.println(validateIP("192.168.0.3"));
		System.out.println(validateIP("192.168.0.3/32"));
		System.out.println(validateIP("256.168.0.3/33"));
		System.out.println(Integer.valueOf("null"));
	}
	
	public static boolean validateIP(String ip) {
		Pattern pat = Pattern.compile("((0|1?[0-9]{2}?|25[0-5]|2[0-4][0-9])\\.){3}(0|1?[0-9]{1,2}?|25[0-5]|2[0-4][0-9])(\\/(0|[12][0-9]?|3[0-2]?))?");
		Matcher mat = pat.matcher(ip);
		System.out.print(ip + " - ");
		return mat.matches();
	}
}
