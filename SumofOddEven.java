package org.task;

public class SumofOddEven {
public static void main(String[] args) {
	int odd=0;
	int even=0;
	for (int i = 1; i <=100; i++) {
		if (i%2!=0) {
			odd=odd+i;
		}
		else {
		even=even+i;	
		}
	}
	System.out.println(odd);
	System.out.println(even);
}
}
