package Learning.Code;

import java.util.HashSet;
import java.util.Set;

public class _3_LongestSubStrWIthoutRepeat {

	public int lengthOfLongestSubstring(String s) {
		/*
		 * 1. for string s, create a sliding window [i,j) 
		 * 2. 0<i<j<=n 
		 * 3. check subStr[i,j) 
		 * 		if has no repeat char, 
		 * 			then i=j+1, 
		 * 		else 
		 * 			move subStr[i,j) into longStr i=j-1 
		 * 4. got to 3. until i to the end of string
		 */
		int max=0;
		if (s == null )
			return max;

		char[] aChars = s.toCharArray();
		Set<Character> set=new HashSet<Character>();
		String slidingWindow ="";
		for (int i = 0; i < aChars.length; i++) {
			set.add(aChars[i]);
			for(int j=i+1;j<=aChars.length;j++) {
				slidingWindow = s.substring(i,j);
				if(j==aChars.length || set.contains(aChars[j])) {
					max = max>slidingWindow.length()?max:slidingWindow.length();
					set.clear();
					break;
				}else {
					set.add(aChars[j]);
				}
			}
		}
		return max;

	}
}
