package Learning.Code;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Properties;
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
		try {
			App o = new App();
			o.testMatchMethod();

			Properties ps = System.getProperties();
			System.out.println(ps.toString());

			InetAddress addr;
			String hostname = InetAddress.getLocalHost().getHostName();

			int[] a = { 1 };
			System.out.println("null" + a[2]);

			throw new IOException("ioioioi");

		} catch (IOException e) {
			System.out.println("catch ioexception");
		} finally {
			System.out.println("finally!!!!!!!");
		}
	}
}
