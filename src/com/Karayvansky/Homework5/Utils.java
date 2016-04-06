package com.Karayvansky.Homework5;

public class Utils {
	public static void printArray(int[] array) {
		System.out.println("The resultated array:");
		for (int i = 0; i < array.length; i++) {
			if (i != 0)
				System.out.print(",");
			System.out.print(array[i]);
		}
	}
}
