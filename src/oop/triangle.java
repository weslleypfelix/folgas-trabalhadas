package oop;

import java.util.Locale;
import java.util.Scanner;

public class triangle {

	double l1;
	double l2;
	double l3;

	public double area() {
		double a = (l1 + l2 + l3) / 2;
		System.out.println(a+" metros de área");
		return a;
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		triangle tr1 = new triangle();
		triangle tr2 = new triangle();
		System.out.println("1º TRIÂNGULO");
		System.out.println("Enter first ");
		tr1.l1 = scan.nextDouble();
		System.out.println("Enter second ");
		tr1.l2 = scan.nextDouble();
		System.out.println("Enter third ");
		tr1.l3 = scan.nextDouble();
		System.out.println();
		System.out.println("2º TRIÂNGULO");
		System.out.println("Enter first ");
		tr2.l1 = scan.nextDouble();
		System.out.println("Enter second ");
		tr2.l2 = scan.nextDouble();
		System.out.println("Enter third ");
		tr2.l3 = scan.nextDouble();
		System.out.println();
		tr1.area();
		tr2.area();
		System.out.println();
		double area1 = (tr1.l1 + tr1.l2 + tr1.l3) / 2;
		double area2 = (tr2.l1 + tr2.l2 + tr2.l3) / 2;

		if (area1 > area2) {
			System.out.println("AREA1 LARGER");
		} else {
			System.out.println("AREA2 LARGER");
		}
	}

}
