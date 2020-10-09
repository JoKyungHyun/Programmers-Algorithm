package Level02;

public class Problem01 {
	public static int[] solution(int[] prices) {
		int[] answer = {};

		for (int i = 0; i < prices.length; i++) {
			int sum = 0;
			for (int j = i + 1; j < prices.length; j++) {

				if (prices[i] < prices[j]) {
					sum = sum + 1;
				} else {
					break;
				}
			}
			prices[i] = sum;
		}
		return answer;
	}

}
