package edu.training.jc.lesson06.cycles;

public class TaskSeven {

	public static void main(String[] args) {
		double a = -5;
		double b = 5;
		double h = 0.5;
		double result = 0;

		for(double i = a; i <= b; i = i + h) {
			result = 5 - (Math.pow(i, 2) / 2);
			System.out.println("y = 5 - " + Math.pow(i, 2) + " / 2 = " + result);
		}
	}

}
