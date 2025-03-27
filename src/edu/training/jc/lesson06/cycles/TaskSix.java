package edu.training.jc.lesson06.cycles;

public class TaskSix {

	public static void main(String[] args) {
		double a = 1;
		double count = 1;
		double n = a - 1;

		while (n < 1) {
			n++;
		}

		for (int i = 0; i < 10; i++) {
			count = count * (6 + n);
			n++;
			System.out.println(count);
		}
	}

}
