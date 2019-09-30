 import java.util.*;

public class Main {

	public static void main(String args[])
	{
		
		
		String string_1 = "java nered";
		String string_2 = "nered java";
		// evaluated to true
		System.out.println(isPermutation(string_1, string_2));
		
		
		 string_1 = "java";
		string_2 = "jave";
		// evaluated to false
		System.out.println(isPermutation(string_1, string_2));
	}
	
	
	//returns sorted string
	private static String Sort(String string)
	{
		char[] values = string.toCharArray();
		
		Arrays.sort(values);
		
		
		
		return String.valueOf(values);
	}
	
	
	//checks if the strings are identical
	private static boolean isPermutation(String str, String str2)
	{
		//can't be permutation if different string length
		if(str.length() == str2.length())
		{
			if(Sort(str).equals(Sort(str2)))
				return true;
			else
				return false;
		}
		else {return false;}
		
	}
	
	

}
