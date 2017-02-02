package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * TODO: comment
 * @author beleychev.ilya 01.02.2017   16:59
 */
public class Regex {

	public static void main(String[] args) {

		String pattern = "((0[1-9])|(1[0-5])|(2[124567]))[0-9a-zA-Zа-яА-Я]{20}\\d{3}";
		String text = "040asdqwerfghtyujki04q001";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		while (m.find()) {
			System.out.println(text.substring(m.start(), m.end()) + "*");
		}
	}
}
