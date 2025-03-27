package edu.training.jc.lesson06.branching;

public class TaskTen {

	public static void main(String[] args) {
		int a = 15;
		int b = 20;
		int c = 21;
		int k = 5;

		if (a % k == 0) {
			System.out.println("Число k = " + k + " является делителем числа a = " + a);
		}
		if (b % k == 0) {
			System.out.println("Число k = " + k + " является делителем числа b = " + b);
		}
		if (c % k == 0) {
			System.out.println("Число k = " + k + " является делителем числа c = " + c);
		}

	}

}
