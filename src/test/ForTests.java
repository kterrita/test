package test;

/**
 * TODO: comment
 * @author beleychev.ilya 12.01.2017   17:58
 */
public class ForTests {
	public static void main(String[] args) {
		NullReferenceTest nullReferenceTest = null;
		System.out.println(nullReferenceTest.SomeVar);
	}
}

 class NullReferenceTest {
	public static final String SomeVar = "hello world";
}
