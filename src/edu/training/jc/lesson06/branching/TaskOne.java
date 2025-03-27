package edu.training.jc.lesson06.branching;

public class TaskOne {

	public static void main(String[] args) {

		double firstArea = 12.3;
		double secondArea = 12.3;

		if (firstArea > secondArea) {
			System.out.println("Площадь первого треугольника = " + firstArea + " больше площади второго треугольника = "
					+ secondArea);
		} else if (firstArea < secondArea) {
			System.out.println("Площадь первого треугольника = " + firstArea + " меньше площади второго треугольника = "
					+ secondArea);
		} else {
			System.out.println("Площади первого и второго треугольников равны между собой = " + firstArea);
		}

	}

}
