package CodingTask;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetLessThan3Test {
	
	private GetLessThan3 ct1;

	@BeforeEach
	void setUp() throws Exception {
		ct1 = new GetLessThan3();	
	}
	
	@AfterEach
	void tearDown() throws Exception {
		ct1 = null;
	}

	@Test
	void normal_test1() {
		int[] testArray = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5};
		
		final int expected = 3;
		final int actual = ct1.getLess3(testArray);
		
		// normal test
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	void normal_test2() {
		int[] testArray = {4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 8, 8, 8};
		
		final int expected = 7;
		final int actual = ct1.getLess3(testArray);
		
		// normal test
		Assert.assertEquals(actual, expected);
	}

	@Test
	void normal_test3() {
		int[] testArray = {7, 7, 7, 8, 8, 9, 9, 10, 10, 10, 11, 11};
		
		final int expected = 8;
		final int actual = ct1.getLess3(testArray);
		
		// get first instance of less than 3 repeating value
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	void max_test() {
		int[] testArray = {4,4,4,4,4,4,5,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,10,11,11,11};
		
		final int expected = 10;
		final int actual = ct1.getLess3(testArray);
		
		// get first instance of less than 3 repeating value
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	void min_test() {
		int[] testArray = {1, 2, 3};
		
		final int expected = 1;
		final int actual = ct1.getLess3(testArray);
		
		// get first instance of less than 3 repeating value
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	void error_test1() {
		int[] testArray = {3};
		
		final int expected = -1;
		final int actual = ct1.getLess3(testArray);
		
		// list values cannot be compared
		Assert.assertEquals(actual, expected);
	}

}
