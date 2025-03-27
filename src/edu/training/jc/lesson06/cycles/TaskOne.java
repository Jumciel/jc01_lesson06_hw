package edu.training.jc.lesson06.cycles;

public class TaskOne {

	public static void main(String[] args) {
		
		int a = -8;
		int b = 8;
		int h = 1;

		for (int i = a; i <= b; i = i + h) {
			if (i > 2) {
				System.out.println("f(y) = x : " + i);
			} else if (i <= 2) {
				System.out.println("f(y) = -x : " + -i);
			}
		}
	}

}
