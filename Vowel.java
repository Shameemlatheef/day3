package com.day4;

public class Vowel {
	String k="a";
	String vowele="aeiou";
	String consonent="bcdfghjklmnpqrstwxyz";
public static void main(String[] args) {
	Vowel j=new Vowel();
	int count=0;
	for(int i=0;i<j.vowele.length();i++) {
		
		if(j.vowele.charAt(i)==j.k.charAt(0)) {
			System.out.println("vowel");
			break;
		}
		else 
			for(int x=0;x<j.consonent.length();x++){
				if(j.consonent.charAt(x)==j.k.charAt(0)) {
				count++;
				break;
				}
				
			}
		
		
	}
	if(count>0) {
		System.out.println("consonent");
	}else {
		 System.out.println("error");
	}
	
}
}
