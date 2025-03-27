package edu.training.jc.lesson06.cycles;

public class TaskEight {

	public static void main(String[] args) {
		double n = 10;
		double result = 0;
		
		for(double i = 1; i <= n; i++) {
			result = result + 1 / i;
		}
		
		System.out.printf("Результат выражения = " + "%.3f", result);
	}

}
