public class MaxSubArraySlidingWindow {

	public static void main(String[] args) {
		int[] array = {1, 5, -1, 6, 3, 2};
		System.out.println(calculateMaxSubArray(array,3));
	}

	public static int calculateMaxSubArray(int[] data, int k) {
		int count = 1;
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int j=0;
		for (int i = 0; i < data.length; i++) {
			if (count <= 3) {
				sum += data[i];
				count++;
			}else {
				sum=sum-data[j];
				sum=sum+data[i];
				j++;
			}
			max = Math.max(max, sum);
		}
		return max;
	}
}