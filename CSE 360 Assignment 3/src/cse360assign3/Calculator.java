
package cse360assign3;

/**Calculator
 * 
 * @author Geoffrey Lunt
 * @version Jan 21, 2016
 */
public class Calculator {

	private int total;
	
	/** Creates new Calculator object */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** Retrieves private int total
	 * @return total	current total
	 */
	public int getTotal () {
		return total;
	}
	
	/** adds a value to current total
	 * @param value		integer to be added
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/** subtracts a value from the current total
	 * @param value		integer to be subtracted
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/** multiplies current total by given value
	 * @param value		integer used to multiply
	 */
	public void multiply (int value) {
		total = total*value;
	}
	
	/** divides current total by given value. If the value is 0 sets total to 0
	 * @param value		integer used to divide
	 */
	public void divide (int value) {
		if(value == 0){
			total = 0;
		}
		else{
			total = total/value;
		}
	}
	
	/** returns a string that contains a list of the commands executed 
	 * @return		string containing commands executed
	 */
	public String getHistory () {
		return "";
	}
}