package edu.training.jc.lesson06.cycles;

public class TaskThree {

	public static void main(String[] args) {
		int count = 0;

		for (int i = 0; i <= 100; i++) {
			count = (int) (count + Math.pow(i, 2));
		}
		System.out.println("Сумма квадратов первых 100 чисел = " + count);

	}

}
