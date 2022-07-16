package Logical_Programs;

import java.util.Scanner;

public class Even_odd_numbers {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number");
	 int num=scan.nextInt();
	if(num%2==0) {
		System.out.println("given num is even");
	}
	else {
		System.out.println("given num is odd");
	}
}
}
