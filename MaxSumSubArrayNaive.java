package Test;

public class MaxSumSubArrayNaive {

	public static void main(String[] args) {
		int[] array = {1, 5, -1, 6, 3, 2};
		System.out.println(maxSubarraySum(array,array.length,3));
	}
	
	static int maxSubarraySum(int[] arr, int n, int k)
	{
	    int max = Integer.MIN_VALUE;
	    for (int i=0;i<=arr.length-k;i++){
	        int sum =calculateSum(arr,i,k);
	        if (sum>max) {
	            max=sum;
	        }
	   }
	   return max;
	    
	}

	static int calculateSum(int[] arr,int i,int k){
	    int sum=0;
	    for(int j=i;j<i+k;j++){
	        if(j<arr.length){
	            sum+=arr[j];
	        }
	    }
	    return sum;
	}
}
