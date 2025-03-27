package edu.training.jc.lesson06.cycles;

public class TaskTwo {

	public static void main(String[] args) {
		int a = -5;
		int b = 20;
		int h = 5;
		int f;

		for (int i = a; i <= b; i = i + h) {
			if (i == 15) {
				f = (i + 2) * 2;
				System.out.println("f(y) = (i + 2) * 2 = " + f);
			}else {
				f = (i - 2) + 6;
				System.out.println("f(y) = (i - 2) + 6 = " + f);
			}
		}
	}

}
