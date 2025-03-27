package edu.training.jc.lesson06.branching;

public class TaskFive {

	public static void main(String[] args) {
		double x = 5;
		double y = 4;

		System.out.println("Первоначальное число x = " + x + " число y = " + y);
		if (x > y) {
			y = (x + y) / 2;
			x = 2 * x * y;
			System.out.println("Изменненное число x = " + x + " число y = " + y);
		} else if (x < y) {
			x = (x + y) / 2;
			y = 2 * x * y;
			System.out.println("Изменненное число x = " + x + " Число y = " + y);
		} else {
			System.out.println("Числа оказались равными, введите другие значения");
		}

	}

}
