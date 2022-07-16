package Logical_Programs;

public class Armstrong_number {
public static void main(String[] args) {
	int num=143;
	int act=num;
	int r=0;
	int arm=0;
	while(num>0) {
		r=num%10;//it seperates numbers
		arm=r*r*r+arm;
		num=num/10;
	}
	if(act==arm) {
		System.out.println("given number is armstrong");
		
	}
	else {
		System.out.println("given number is not armstrong");
	}
}
}
