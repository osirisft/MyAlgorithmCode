package Learning.Code.String;

import java.util.ArrayList;
import java.util.List;

public class _6ZigZag {
	public static String convert(String s, int numRows) {

		List<StringBuilder> rows = new ArrayList<StringBuilder>();
		for (int i = 0; i < Math.min(s.length(), numRows); i++)
			rows.add(new StringBuilder());

		boolean isGoingDown = true;
		int currRow = 0;
		if (numRows == 1)
			return s;
		for (char c : s.toCharArray()) {
			rows.get(currRow).append(c);
			if ((currRow == 0 && !isGoingDown) || (currRow == rows.size() - 1) && isGoingDown) {
				isGoingDown = !isGoingDown;
			}
			currRow = isGoingDown ? currRow + 1 : currRow - 1;
		}
		StringBuilder result = new StringBuilder();
		for (StringBuilder sb : rows)
			result.append(sb);
		return result.toString();

	}

}
