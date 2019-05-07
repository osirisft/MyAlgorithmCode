package Learning.Code;

import static org.junit.Assert.*;

import org.junit.Test;

import Learning.Code.String._6ZigZag;
import junit.framework.Assert;

public class _6ZigZagTest {

	@Test
	public void test() {
		Assert.assertEquals("abc", _6ZigZag.convert("abc", 1));
	}

	@Test
	public void test1() {
		Assert.assertEquals("PAHNAPLSIIGYIR", _6ZigZag.convert("PAYPALISHIRING", 3));
	}

}
