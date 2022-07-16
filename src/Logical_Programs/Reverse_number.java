package Logical_Programs;

public class Reverse_number {//parseint() it will convert string into integer
public static void main(String[] args) {
int num=235;
String orgnum=Integer.toString(num);
String rev="";
for(int i=orgnum.length()-1;i>=0;i=i--) {
	rev=rev+orgnum.charAt(i);
}
int revnum=Integer.parseInt(rev);
System.out.println(revnum);


}
}
