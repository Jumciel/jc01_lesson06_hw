package edu.training.jc.lesson06.branching;

public class TaskSix {

	public static void main(String[] args) {

		double x = 12;
		double y = 13;
		double coordinateAngle;

		if (x > 0) {
			coordinateAngle = Math.toDegrees(Math.atan(y / x));
			System.out.println("Координатный угол = " + coordinateAngle);
		} else if (x < 0) {
			coordinateAngle = Math.toDegrees(Math.atan(y / x)) + 180;
			System.out.println("Координатный угол = " + coordinateAngle);
		} else if (x == 0 && y > 0) {
			System.out.println("Координатный угол = 90");
		} else if (x == 0 && y < 0) {
			System.out.println("Координатный угол = 270");
		} else if (x > 0 && y == 0) {
			System.out.println("Координатный угол = 0");
		} else {
			System.out.println("Координатный угол = 180");
		}

	}

}
