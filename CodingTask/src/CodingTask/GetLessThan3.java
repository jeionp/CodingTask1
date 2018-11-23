/**
 * 
 */
package CodingTask;

/**
 * @author jeion
 *
 */
public class GetLessThan3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// test values
		int[] testArray = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5};
		int[] testArray2 = {4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 8, 8, 8};
		int[] testArray3 = {1, 1, 1, 5, 5, 5, 6, 6, 7, 7, 7, 8, 8, 8};
		
		// get non repeating 3x value in sequential list
		int iNotRepeat3 = getLess3(testArray3);
		
		// display non repeating values
		if (iNotRepeat3 < 0) {
			System.out.println("Target value not found.");
		} else {
			System.out.println("The number " + iNotRepeat3 + " does not repeat 3x.");
		}		
	}
	
	public static int getLess3(int[] inputArray) {
		
		// set initial value for counter
		int counter = 1;
		
		// if list has less than 2 items, return
		if (inputArray.length < 2) {
			return -1;	
		}
		
		// iterate through the list
		for (int i=1; i<inputArray.length; i++) {
			// check if previous value is same as current value
			if (inputArray[i] == inputArray[i-1]) {
				counter++;
				continue;
			}
			
			// if less than 3 iterations, return value
			if(counter < 3) {
				return inputArray[i-1];
			}
			
			// reset to initial value
			counter = 1;
		}		
		
		// if target value is not found, return -1
		return -1;		
	}

}
