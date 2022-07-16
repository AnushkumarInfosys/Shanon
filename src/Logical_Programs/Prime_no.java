package Logical_Programs;

import java.util.Scanner;

public class Prime_no {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number to check whether it is prime or not");
	int num = scan.nextInt();
	System.out.println(num);
	int count =0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
			
		}
	}
	if(count==2) {
		System.out.println("given no is prime ");
	}
	else {
		System.out.println("given number is not prime");
	}
	
	
}
}
