package Learning.Code.Array;

public class Array2D {
	static int getHourGlassSumByPos(int[][] arr, int i, int j) {
		int result = 0;
		result = arr[i][j];
		result = result + arr[i][j + 1];
		result = result + arr[i][j + 2];
		result = result + arr[i + 1][j + 1];
		result = result + arr[i + 2][j];
		result = result + arr[i + 2][j + 1];
		result = result + arr[i + 2][j + 2];
		return result;
	}

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int max = Integer.MIN_VALUE;
		System.out.println(max);
		for (int i = 0; i < arr.length - 2; i++)
			for (int j = 0; j < arr[i].length - 2; j++) {
				int sum = getHourGlassSumByPos(arr, i, j);
				max = sum > max ? sum : max;
			}
		return max;
	}

}
