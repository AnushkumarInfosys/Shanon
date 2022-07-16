package Logical_Programs;

public class Replace_multiple_special_characters {
public static void main(String[] args) {
	String name="Anku#s@h%k  uma*r";
	String correctname = name.replaceAll("[^a-zA-z]", "");
	System.out.println(correctname);
}
}
