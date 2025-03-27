package edu.training.jc.lesson06.cycles;

public class TaskNine {

	public static void main(String[] args) {
		double result = 2;
		int n = 100;
		
		for(int i = 1; i <= n; i++) {
			result = result + Math.pow(i, 2);
		}
		
		result = Math.pow(result, 10);
		
		System.out.println("Результат выражения = " + result);
		
	}

}
