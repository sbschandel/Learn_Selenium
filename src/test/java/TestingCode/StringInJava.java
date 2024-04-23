package TestingCode;

import java.util.ArrayList;

public class StringInJava {

	public static void main(String[] args) {
		//TODO Auto-generated method
		// string is an object
		//String s2 = new String("Lord Is Smart");
		//String s3 = new String ("Smart");
		//String s = "ravi is Great";
		//String s1 = "ravi is Great";
		String s = "ravi is Great";
//		s.split(" ");
//		String[] splittedString = s.split("is");
//		System.out.println(splittedString[0]);
//		System.out.println(splittedString[1]);
//		//System.out.println(splittedString[2]);
		//O/P ravi
		//     is
		//    Great
		// Want to trim behalf of "is"
		// string [] splittedString s.split("is");
		//System.out.println(splittedString[0]);
		//System.out.println(splittedString[1]);
		//Output ravi_
		//       _Great

//		System.out.println(splittedString[1].trim());
		//Output Great

////		for (int i = 0; i<s.length();i++)
//		{
//	    System.out.println(s.charAt(i));
//		}
		//Output  r
		//        a
		//        v
		//        i
		//        i
		//        s
		//        G
		//        r
		//        e
		//        a
		//        t

		//to print reverse string

		for (int i = s.length()-1; i>=0;i--)
		{
	    System.out.println(s.charAt(i));
		}
		//  Output
		//  t
		//  a
		//  e
		//  r
		//  G
		//  s
		//  i
		//  i
		//  v
		//  a
		//  r
		}	
}
