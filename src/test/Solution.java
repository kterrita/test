package test;

/**
 * TODO: comment
 * @author beleychev.ilya 12.01.2017   17:23
 */
public class Solution {

	public static void main(String[] args) {
		String s1 = "str";
		String s2 = new String ("str");
		System.out.println(s1 == s2.intern());
	}
}
