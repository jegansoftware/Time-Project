//file name should be named as jega.java
package Program;
import java.util.*;
public class jega {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		analze in1= new analze();
		int word1;
		String word;
		char semi;
		//Declare variable for first part of time
		char set1;
		char set2;
		//Declare variable for second part of time
	
		
		char set_4;
		char set_3;
		
		
		System.out.printf("\nEnter Time:");
		word=in.next();
		
		word1=word.length();
		
	
		
		semi=word.charAt(2);
		set1=word.charAt(0);
		set2=word.charAt(1);
		set_4=word.charAt(4);
		set_3=word.charAt(3);
		
		if(semi==':')
		{
			if(word1==5)
			{
				in1.value(set1,set2,set_3,set_4);
				
			}
			else
			{
				System.out.printf("\nSorry !!! You made a mistake ");
				System.out.printf("\nTime must be entered like this (For Example :09:45)");
			}
					
		}
		else
		{
			System.out.printf("\nTime must be entered like this (For Example :09:45)");
		}
		
	}

}



