package Logical_programs_practice_from_11_number;

import java.util.Arrays;

public class Array_ascending {
public static void main(String[] args) {
	int ar[]= {10,50,40,20,30,60};
	//print data in array
	//for(int i=0;i<=ar.length-1;i++) {
	//	System.out.println(ar[i]); 
	
	//print in ascending order
	Arrays.sort(ar);
	for(int i=0;i<=ar.length-1;i++) {
	System.out.println(ar[i]);
}
}
}

