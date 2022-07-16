package Logical_programs_practice_from_11_number;

public class revnumber {
public static void main(String[] args) {
	int num=1234;
	int revNum=0;
	for(int i=num;i>0;i=i/10) {
	int rem=i%10;
	revNum=revNum*10+rem;
	}
	System.out.println(revNum);
	if(revNum==num) {
		System.out.println("no is palindrome");
	}
	else {
		System.out.println("is not palindrome");
	}
}

}

