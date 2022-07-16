package Logical_programs_practice_from_11_number;

import java.util.Scanner;

public class Accept_input_from_user {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter no 1");
	int num1=scan.nextInt();
	System.out.println("enter no 2");
	int num2=scan.nextInt();
	System.out.println("addition"+(num1+num2));
	//for string
	System.out.println("enter the name");
	String name=scan.next();
	System.out.println(name);
}
}
