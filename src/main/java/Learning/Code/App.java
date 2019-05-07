package Learning.Code;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {

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
