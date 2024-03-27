package TestingCode;

import java.util.ArrayList;

public class Java {

	public static void main(String[] args) {
		int [] arr = new  int[5];
		arr [0]  = 1;
		arr [1]  = 2;
		arr [2]  = 3;
		arr [3]  = 4;
		arr [4]  = 7;
		
		int [] arr2 = {1,2,3,4,7,8,12,14,112,118};
		System.out.println(arr2[0]);
		 //for loop arr.length = 5
		 
		for ( int i = 0 ; i< arr.length; i++)
{
	System.out.println(arr[i]);
	
}
	String[] name = {"Ravi", "Rahul", "Ruchi"};
        for (int i = 0; i<name.length; i++ )
        {
        	System.out.println(name[i]);
        }
		System.out.println(arr2[0]);
		
		
		 //for loop arr.length = 5
		for ( int i = 0 ; i< arr2.length; i++)
		{  
			if ( arr2 [i] % 2 ==  0)
			{
				System.out.println(arr2[i]);  
				break;
			}
			else 
			{
				System.out.println(arr2[i] +"is not multiple of 2");
			}
		}
        	
        ArrayList<String> a = new ArrayList<String>();
		a.add("Ravi");
		a.add("Rahul");
		a.add("Ruchi");
		a.add("Ram");
		a.get(3);
		System.out.println(a.get(3));
		
		for (int i = 0 ; i<a.size(); i++) 
		{
			System.out.println(a.get(i));

		}
		System.out.println("**********");
		for (String val :a)
		{
			System.out.println(val);
		}
		 //items are present in Arraylist
		System.out.println(a.contains("Ravi"));
		
		}	
}
