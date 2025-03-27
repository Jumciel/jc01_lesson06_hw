package edu.training.jc.lesson06.branching;

public class TaskThree {

	public static void main(String[] args) {
		double x1 = 5;
		double y1 = 11;
		double x2 = 22;
		double y2 = 2;
		double firstDistance;
		double secondDistance;

		firstDistance = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		secondDistance = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

		if (firstDistance > secondDistance) {
			System.out.println("Первая точка = " + firstDistance + " находится дальше чем вторая = " + secondDistance);
		} else if (firstDistance < secondDistance) {
			System.out.println("Первая точка = " + firstDistance + " находится ближе чем вторая = " + secondDistance);
		} else {
			System.out.println("Точки находятся на одинаковом удалении = " + firstDistance);
		}
	}

}
