package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] s) {
		System.out.println(validateURL("vk.ru"));
	
		System.out.println(validatePhone("8(9047)640088"));
		System.out.println(validatePhone("89456667657"));
		System.out.println(validatePhone("8(904)7640086"));
		System.out.println(validatePhone("8(756)2334444"));
		System.out.println(validatePhone("78900000000"));
		System.out.println(validatePhone("+78900000000"));
		System.out.println(validatePhone("+88900000000"));
	}
	
	public static boolean validateURL(String url) {
		Pattern pat = Pattern.compile(".+\\.(com|ru|ua|org|net)");
		Matcher m = pat.matcher(url);
		System.out.print(url + " - ");
		return m.matches();
	}
	
	public static boolean validatePhone(String phone) {
		Pattern pat = Pattern.compile("^(\\+?7|8)(\\(?\\d{3}\\)?)\\d{7}");
		Matcher m = pat.matcher(phone);
		System.out.print(phone + " - ");
		return m.matches();
	}
}