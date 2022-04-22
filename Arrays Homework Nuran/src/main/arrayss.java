package main;

import java.util.Scanner;

public class arrayss {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] arr = new int [] {1,5,7,3,9,23,90};
		int [] arrClone = new int[arr.length];
		for (int i = 0; i<arr.length; i++) {
			arrClone[i]=arr[i];
		};
		for(int i : arrClone) {
			System.out.print(i+",");
		};

	}

}
