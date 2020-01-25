/**
 * RTS Lab Code Exercises 1 and 2
 * @author Haley Currence
 * @version 0.5
 * @since 1/24/2020
 */
public class Exercises {

	/**
	 * #1  Print the number of integers in an array that are 
	 * above the given input and the number that are below, 
	 * e.g. for the array [1, 5, 2, 1, 10] with input 6, 
	 * print “above: 1, below: 4”. 
	 * 
	 * @param array - object array
	 * @param input - integer variable representing the given input
	 * @return number of integers below and above a given input
	 */
	public static <T> String exerciseOne(T[] array, int input)
	{
		/*
		 * The following code checks whether the elements in the 
		 * array can be converted into an Integer object.
		 */
		Integer[] arr = null;
		try
		{
			arr = (Integer[])array;
		}
		catch (Exception e)
		{
			arr = new Integer[array.length];
			
			for(int i=0; i<arr.length; i++)
			{
				try
				{
					arr[i] = Integer.parseInt((String) array[i]);
				}
				catch (Exception ex)
				{
					arr[i] = null;
				}
			}
		}
		
		//The following code counts how many elements in the 
		//array are above or below the input value.
		
		int numAbove = 0;
		int numBelow = 0;
	
		for(Integer i : arr)
		{
			if (i == null)
			{
				//Left empty to deal with the NullPointerException. Not meant to do anything.
			}
			else if(i<input)
			{
				numBelow++;
			}
			else if(i>input)
			{
				numAbove++;
			}
			else
			{
				//unknown
			}
		}
		
		String out = "above: " + numAbove + ", below: " + numBelow;
		return out;
	}
	
	/**
	 * #2  Rotate the characters in a string by a given input 
	 * and have the overflow appear at the beginning, 
	 * e.g. “MyString” rotated by 2 is “ngMyStri”.
	 * 
	 * @param inputString - String variable holding the word or phrase to be rotated counter-clockwise
	 * @param numRotate - integer variable representing the number of characters to be rotated
	 * @return the new String variable rotated counter-clockwise 
	 */
	public static String exerciseTwo(String inputString, int numRotate)
	{
		//The following code checks numRotate to ensure optimal execution.
		if(numRotate<=0)
		{
			return inputString;
		}
		else if(numRotate>inputString.length())
		{
			int multi = numRotate/inputString.length();
			numRotate = numRotate - (inputString.length()*multi);
		}
		
		//The following code rotates the inputString and outputs it as a new object.
		String str = inputString;
		
		str = str.substring(str.length()-numRotate).concat(str.substring(0, (str.length()-numRotate)));
		
		return str;
		
		
	}
}
