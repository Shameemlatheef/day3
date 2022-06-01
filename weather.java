package com.day4;

public class weather {
public static void main(String[] args) {
	boolean issnowing=true;
	boolean israining=false;
	double temp=60.0;
	if(issnowing==true || israining==true || temp <=50) {
		System.out.println("lets stay home");
	}
	else {
		System.out.println("lets go out");
	}
}
}
