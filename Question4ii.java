package org.task2;

public class Question4ii {
public static void main(String[] args) {
	for (int i = 1; i <=3; i++) {
		for (int j = 1; j <3-i+1; j++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
}
}
