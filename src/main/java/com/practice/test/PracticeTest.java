package com.practice.test;

import java.util.Arrays;

public class PracticeTest {
	public Boolean anagram(String str1,String str2) {
		//first check length same or not 
		if(str1.length()!=str2.length()) 
			return false;
		
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[] chararray1=str1.toCharArray();
		char[] chararray2=str2.toCharArray();
		
		Arrays.sort(chararray1);
		Arrays.sort(chararray2);
		
		return Arrays.equals(chararray1, chararray2);
	}

	public static void main(String[] args) {
		PracticeTest newobj=new PracticeTest();
		
		System.out.println( newobj.anagram("listen", "silent")+" Hello Java!");

	}

}
