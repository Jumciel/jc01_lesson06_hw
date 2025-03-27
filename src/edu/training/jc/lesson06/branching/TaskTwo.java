package edu.training.jc.lesson06.branching;

public class TaskTwo {

	public static void main(String[] args) {
		double one = 1;
		double two = -2;
		double three = 3;

		if (one > 0) {
			System.out.println("Первое число положительное: " + one);
			System.out.println(one = Math.pow(one, 2));
		} else {
			System.out.println("Первое число отрицательное: " + one);
			System.out.println(one = Math.pow(one, 4));
		}
		if (two > 0) {
			System.out.println("Второе число положительное: " + two);
			System.out.println(two = Math.pow(two, 2));
		} else {
			System.out.println("Второе число отрицательное: " + two);
			System.out.println(two = Math.pow(two, 4));
		}
		if (three > 0) {
			System.out.println("Третье число положительное: " + three);
			System.out.println(three = Math.pow(three, 2));
		} else {
			System.out.println("Третье число отрицательное: " + three);
			System.out.println(three = Math.pow(three, 4));
		}

	}

}
