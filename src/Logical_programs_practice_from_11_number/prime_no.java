package Logical_programs_practice_from_11_number;

public class prime_no {
public static void main(String[] args) {
	int num=2;
	int count =0;
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
		}
	if(count==2) {
		System.out.println("no is prime");
	}
	else {
		System.out.println("no is not prime");
	}
}
}

