package com.Karayvansky.Homework5;

public class SecondTask {

	public static void main(String[] args) {
		int x[] = { 1, 3, 5 };
		int y[] = { 2, 4, 8, 9, 12 };

		int k;

		boolean flag = true;
		int[] z = new int[x.length + y.length];
		for (int i = 0; i < x.length; i++)
			z[i] = x[i];
		int n = 0;
		for (int i = x.length; i < x.length + y.length; i++) {
			z[i] = y[n];
			n++;
		}
		flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < x.length + y.length - 1; i++) {
				if (z[i] > z[i + 1]) {
					k = z[i];
					z[i] = z[i + 1];
					z[i + 1] = (int) k;
					flag = true;
				}
			}
		}
		Utils.printArray(z);
	}

}
