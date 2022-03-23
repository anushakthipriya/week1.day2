package week1.day2;

import java.util.Arrays;

public class ArraySample {
	public static void main(String[] args) {
		int[] val = {10, 20, 30, 40, 50};
		// val.length();
		System.out.println(val.length);
		Arrays.sort(val);
		for (int i= 0; i<val.length; i++)
			System.out.println(val[i]);
	}
	
	
}
