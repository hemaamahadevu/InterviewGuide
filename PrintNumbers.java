package Recursion;

public class PrintNumbers {
	
	public static void main(String[] args) {
		printNumbers(1,10);
	}
	
	public static void printNumbers(int i,int n){
		if(i>n) {
			return;
		}
		System.out.println(i);
		 printNumbers(i+1,n);
	}
}
