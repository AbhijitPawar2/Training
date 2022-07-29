package basic;

public class MinAvgMax {

	public static void main(String[] args) {
		int[] numbers = { 1, 5, 3, 2, -9};
		int min = minimum(numbers);
		System.out.println("Minimum is : " + min);
		int max = maximum(numbers);
		System.out.println("Maximum is : " + max);
		double avg = average(numbers);
		System.out.println("Average is : " + avg);

	}
	
	public static int minimum(int[] array) {
		int min = 0;
		min = Math.min(array[1], array[2]);
		for(int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static int maximum(int[] array) {
		int max = 0;
		max = Math.max(array[1], array[2]);
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static double average(int[] array) {
		double total = 0.0;
		for(int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		double avg = total / array.length;
		return avg;
	}
}
