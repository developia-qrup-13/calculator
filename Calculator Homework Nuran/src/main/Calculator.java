package main;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scanner.nextInt();
		System.out.println("Enter Second Number");
		int b = scanner.nextInt();
		int sum = a+b;
		int multi = a*b;
		double sec = a/b;
		int cix = a-b;
		System.out.println(sum);
		System.out.println(multi);
		System.out.println(sec);
		System.out.println(cix);

	}

}
