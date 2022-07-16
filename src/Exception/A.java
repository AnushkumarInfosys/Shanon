package Exception;

public class A {
public static void main(String[] args) {
	int a=1;
	int b=0;
	try {
		int c=a/b;
	}
	catch (Throwable ankush) {
		System.out.println("Idiot enter proper denominator");
	}
	System.out.println(1);
	System.out.println(2);
}
}
