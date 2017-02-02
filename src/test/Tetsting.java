package test;

/**
 * TODO: comment
 * @author beleychev.ilya 30.01.2017   18:27
 */
public class Tetsting {

	private static String checkResultLevelParam;

	public static void main(String[] args) {
		String levelParamName = verify();
		failCall(levelParamName);
	}

	private static String verify() {
		checkResultLevelParam = "BLOCKER";
		return checkResultLevelParam;
	}

	private static void failCall(String checkResultLevelParam) {
		if(checkResultLevelParam.equals("BLOCKER") || checkResultLevelParam.equals("ERROR")) {
			System.out.println("Пиздец, ошибка. Всему хана.");
		}
	}
}
