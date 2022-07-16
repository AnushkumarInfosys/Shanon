package Logical_Programs;

public class e2 {
public static void main(String[] args) {
//	char ch='Z';
//	while(ch>='A') {
//		System.out.println(ch--);
//	}
//	
// int num=10;
// int sum=1;
// for(int i=1;i<=10;i++) {
//	 sum=sum+i; 
//	 
// }
// System.out.println(sum);
//	
//	int rem=0;
//	for(int num=245;num>0;num%=10) {
//		rem=num%10;
//		System.out.println(rem);
//		break; 
//	}
	String org="mom";
	String rev="";
	for(int i=org.length()-1;i>=0;i--) {
		rev=rev+org.charAt(i);
	}
		System.out.println(rev);
	

if(org.equals(rev)) {
	System.out.println("given str is palin");
}
else {
	System.out.println("not");
}
}
}



