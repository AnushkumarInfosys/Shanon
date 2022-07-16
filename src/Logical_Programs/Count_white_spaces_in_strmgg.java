package Logical_Programs;

public class Count_white_spaces_in_strmgg {
public static void main(String[] args) {
	String name="R J E S H K U M A R";
	int count=0;
	for(int i=0;i<=name.length()-1;i++) {
		char cheching = name.charAt(i);
		if(cheching==' ') {
			count++;
			
		}
	}
	System.out.println("total no of spaces in given string is: "+count);
}
}
