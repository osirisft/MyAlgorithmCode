package Learning.Code.Array;


import java.io.IOException;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Array2DTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IOException {
		int[][] arr = { { 0, -4, -6, 0, -7, -6 }, { -1, -2, -6, -8, -3, -1 }, { -8, -4, -2, -8, -8, -6 },
				{ -3, -1, -2, -5, -7, -4 }, { -3, -5, -3, -6, -6, -6 }, { -3, -6, 0, -8, -6, -7 } };
		System.out.println(Array2D.hourglassSum(arr));
	}

}
