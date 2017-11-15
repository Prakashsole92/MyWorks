package Multiplies;

public class Solution {
	
	static int result;

	public int solution(int number) {
		for (int i = 1; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}
		System.out.println(result);
		return result;
		
	}
}
