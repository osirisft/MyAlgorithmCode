package Learning.Code;

import java.util.regex.Pattern;

public class App {

	public void testMatchMethod() {
		String s = "batch";
		String s1 = "BATCH";
		System.out.println("batch match 'bat' " + s.matches(".*bat.*"));
		System.out.println("BATCH match 'bat' " + s1.matches(".*bat.*"));

		Pattern p = Pattern.compile(".*bat.*", Pattern.CASE_INSENSITIVE);
		System.out.println("ignore case: " + p.matcher("ss aBATb  ddd").matches());
	}

	public static void main(String[] args) {
		boolean b = false;
		System.out.println((b = true) ? "true" : "false");
	}
}
