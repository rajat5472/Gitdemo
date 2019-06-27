package Coading;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
	System.out.println(Anagramcheck("JAVA","AVAJ"));
		
		}
	public static boolean Anagramcheck(String s1,String s2){
		
		char[] chararrays1= s1.toCharArray();
		char[] chararrays2=s2.toCharArray();  
		Arrays.sort(chararrays1); 
		Arrays.sort(chararrays2 ); 
		
		return Arrays.equals(chararrays1, chararrays1);
		
	}
	

}
  