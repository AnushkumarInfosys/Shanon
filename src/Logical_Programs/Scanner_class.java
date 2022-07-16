package Logical_Programs;

import java.util.Scanner;

import org.yaml.snakeyaml.emitter.ScalarAnalysis;

public class Scanner_class {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//enter first number
	System.out.println("enter 1st number");
	int num1 = sc.nextInt();
	
	//enter 2nd number
	System.out.println("enter the 2nd number");
	int num2= sc.nextInt();
	//perform addition
	System.out.println("addition"+" "+(num1+num2));
}
}
