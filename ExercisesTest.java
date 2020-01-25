import static org.junit.Assert.*;

import org.junit.Test;

public class ExercisesTest {

	@Test
	public void testExerciseOne_1() 
	{
		Integer[] arr = {1, 5, 2, 1, 10};
		int input = 6;
		
		String output = Exercises.exerciseOne(arr, input);
		String expectedOutput = "above: 1, below: 4";
		assertEquals(output, expectedOutput);
	}
	@Test
	public void testExerciseOne_2() 
	{
		Integer[] arr = {1, 2, 3, 4, 5};
		int input = 6;
		
		String output = Exercises.exerciseOne(arr, input);
		String expectedOutput = "above: 0, below: 5";
		assertEquals(output, expectedOutput);
	}
	@Test
	public void testExerciseOne_3() 
	{
		Integer[] arr = {2, 6, 6, 6, -3, 6, 6, 6, 6, 6, 7, 6, 6, 8};
		int input = 6;
		
		String output = Exercises.exerciseOne(arr, input);
		String expectedOutput = "above: 2, below: 2";
		assertEquals(output, expectedOutput);
	}
	@Test
	public void testExerciseOne_4() 
	{
		Integer[] arr = {2, -3, 7, 8};
		int input = 6;
		
		String output = Exercises.exerciseOne(arr, input);
		String expectedOutput = "above: 2, below: 2";
		assertEquals(output, expectedOutput);
	}
	@Test
	public void testExerciseOne_5() 
	{
		String[] arr = {"2", "-3", "7", "8"};
		int input = 6;
		
		String output = Exercises.exerciseOne(arr, input);
		String expectedOutput = "above: 2, below: 2";
		assertEquals(output, expectedOutput);
	}
	@Test
	public void testExerciseOne_6() 
	{
		String[] arr = {"2", "three", "7", "8"};
		int input = 6;
		
		String output = Exercises.exerciseOne(arr, input);
		String expectedOutput = "above: 2, below: 1";
		assertEquals(output, expectedOutput);
	}
	@Test
	public void testExerciseOne_7() 
	{
		Character[] arr = {'a', 'b', 'c'};
		int input = 6;
		
		String output = Exercises.exerciseOne(arr, input);
		String expectedOutput = "above: 0, below: 0";
		assertEquals(output, expectedOutput);
	}

	@Test
	public void testExerciseTwo_1() 
	{
		String str = "MyString";
		int num = 2;
		
		String output = Exercises.exerciseTwo(str, num);
		String expectedOutput = "ngMyStri";
		assertEquals(output, expectedOutput);
	}
	@Test
	public void testExerciseTwo_2() 
	{
		String str = "AABB";
		int num = 2;
		
		String output = Exercises.exerciseTwo(str, num);
		String expectedOutput = "BBAA";
		assertEquals(output, expectedOutput);
	}
	@Test
	public void testExerciseTwo_3() 
	{
		String str = "ABA";
		int num = 1;
		
		String output = Exercises.exerciseTwo(str, num);
		String expectedOutput = "AAB";
		assertEquals(output, expectedOutput);
	}
	@Test
	public void testExerciseTwo_4() 
	{
		String str = "ABA";
		int num = 0;
		
		String output = Exercises.exerciseTwo(str, num);
		String expectedOutput = "ABA";
		assertEquals(output, expectedOutput);
	}
	@Test
	public void testExerciseTwo_5() 
	{
		String str = "ABA";
		int num = 3;
		
		String output = Exercises.exerciseTwo(str, num);
		String expectedOutput = "ABA";
		assertEquals(output, expectedOutput);
	}
	@Test
	public void testExerciseTwo_6() 
	{
		String str = "ABA";
		int num = 4;
		
		String output = Exercises.exerciseTwo(str, num);
		String expectedOutput = "AAB";
		assertEquals(output, expectedOutput);
	}
	@Test
	public void testExerciseTwo_7() 
	{
		String str = "ABA";
		int num = 10;
		
		String output = Exercises.exerciseTwo(str, num);
		String expectedOutput = "AAB";
		assertEquals(output, expectedOutput);
	}

}
