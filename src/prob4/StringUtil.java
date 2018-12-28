package prob4;

public class StringUtil {
	public static String concatenate(String[] str) {
		String concatStr = "";
		for (String string : str) {
			concatStr += string;
		}
		return concatStr;
	}
}
