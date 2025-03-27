package edu.training.jc.lesson06.cycles;

public class TaskFour {

	public static void main(String[] args) {
		double count = 1;
		double infinity = 1.7 * Math.pow(10, 308);

		for (int i = 1; i <= 200; i++) {
			count = (count * Math.pow(i, 2));
		}
		
		if (count > infinity) {
			System.out.println("Произведение квадратов первых 200 чисел невозможно отобразить на экране");
		} else {
			System.out.println("Произведение квадратов первых 200 чисел = " + count);
		}
	}

}
