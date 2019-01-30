package org.task2;

public class Question4iiii {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		for (int j = i; j<11-i-1; j++) {
			System.out.print(" ");
		}
		for (int k = 1; k <(i*2); k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
