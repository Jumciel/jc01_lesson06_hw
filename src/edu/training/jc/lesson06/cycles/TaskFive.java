package edu.training.jc.lesson06.cycles;

public class TaskFive {

	public static void main(String[] args) {
		double count = 1;
		
		for(int i = 2; i <= 200; i++) {
			count = count - Math.pow(i, 3);
		}
		
		System.out.println("Разность кубов первых двухсот чисел = " + count);
	}

}
