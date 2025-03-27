package edu.training.jc.lesson06.branching;

public class TaskSeven {

	public static void main(String[] args) {
		int m = 15;
		int n = 15;
		
		System.out.println("Первоначальное значение m = " + m + " n = " + n);
		if (m != n) {
			if (m > n) {
				n = m;
			} else {
				m = n;
			}
		} else {
			m = 0;
			n = 0;
		}
		System.out.println("m = " + m + "\nn = " + n);
	}

}
