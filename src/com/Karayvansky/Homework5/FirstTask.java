package com.Karayvansky.Homework5;

public class FirstTask {

	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++)
			arr[i] = (int) (Math.random() * 100);
		Utils.printArray(arr);
		selectionSort(arr);
		Utils.printArray(arr);

	}

	public static void selectionSort(int[] arr) {
		long start = System.nanoTime();
		int operation = 0;
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int minsecond = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minsecond = j;
				}
			}
			if (i != minsecond) {
				int temp = arr[i];
				arr[i] = arr[minsecond];
				arr[minsecond] = temp;
			}
			operation++;
		}
		System.out.println();
		System.out.println("Operations: " + operation);
		long end = System.nanoTime();
		long duration = end - start;
		System.out.println("Iterative duration is " + duration + " ns");
	}

}
