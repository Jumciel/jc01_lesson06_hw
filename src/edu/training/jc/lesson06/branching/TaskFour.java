package edu.training.jc.lesson06.branching;

public class TaskFour {

	public static void main(String[] args) {

		int firstAngle = 32;
		int secondAngle = 15;
		int thirdAngle;

		int firstCheck = firstAngle + secondAngle;
		thirdAngle = 180 - firstAngle - secondAngle;

		if (firstCheck < 180 & firstAngle > 0 & secondAngle > 0) {
			System.out.println("Такой треугольник существует");
			if (firstAngle == 90 | secondAngle == 90 | thirdAngle == 90) {
				System.out.println("и он прямоугольный");
			}
		} else {
			System.out.println("Такой треугольник не существует");
		}
	}

}
