package main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// toString copyOf copyOfRange fill equals binarySearch sort
		// eded daxil edin ve bu eded arrayin daxilinde olub olmadiqini yoxlayaq
		// bir array verilib bu arrayin daxilindeki butun elementleri 2 ci array-e klon edin
		Scanner scanner=new Scanner(System.in);
		System.out.println("eded daxil edin");
		int number=scanner.nextInt();// 1
		int[] arr=new int[] {1,2,5,10,9,6,7,8};
		boolean check=false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==number) {
				check=true;
				System.out.println("daxil etdiyiniz eded arrayin daxilindedir");
				break;
			}
		}
		if(!check)//!false=true !true=false
		System.out.println("eded arryin daxilinde deyil");
		
//		int key=10;
//		for(int i=0;i<arr.length;i++) { // i=0,1,2,3,4,5,6,7
//			arr[i]=key;
//		}
//		
//		for (int i : arr) {
//			System.out.print(i+" ");
//		}

		
		


	}

}
