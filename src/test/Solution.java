package test;

/**
 * TODO: comment
 * @author beleychev.ilya 12.01.2017   17:23
 */
public class Solution {
	public static void main(String[] args) {
		String s1 = "str";
		String s2 = "str";
		s2.intern();
		System.out.println(s1 == s2);
	}
}
