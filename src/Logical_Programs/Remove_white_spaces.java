package Logical_Programs;

public class Remove_white_spaces {
public static void main(String[] args) {
	String name="R A J E S H";
	//remove all white space
	String cn = name.replaceAll("[^a-zA-z]","");
	System.out.println(cn);
	//alternative_method
	String cn1 = name.replaceAll("\\s","");
	System.out.println(cn1);
	
}
}
