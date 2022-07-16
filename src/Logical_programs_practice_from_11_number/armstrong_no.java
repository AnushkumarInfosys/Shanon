package Logical_programs_practice_from_11_number;

public class armstrong_no {
public static void main(String[] args) {
	int num=152  ;
	int act=num;
	int r=0;
	int arm=0;
	while(num>0) {
		r=num%10;
		arm=r*r*r+arm;
		num=num/10;
	}
	if(act==arm) {
		System.out.println("armstrong");
	}
	else {
	System.out.println("not");
}
}
}
