package edu.training.jc.lesson06.branching;

public class TaskEight {

	public static void main(String[] args) {
		int a = 2;
		int b = -3;
		int c = -5;
		int count = 0;
		
		if(a < 0){
			count++;
		}
		if(b < 0) {
			count++;
		}
		if(c < 0) {
			count++;
		}
		System.out.println("Количество отрицательных чисел = " + count);
	}

}
