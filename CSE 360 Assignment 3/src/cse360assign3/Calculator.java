package cse360assign3;

/** A simple calculator that performs basic arithmetic on a cumulative total. It also stores a history 
 * of the operations performed.
 * @author Geoffrey Lunt
 * @version Jan 22, 2016
 */
public class Calculator {

	private int total;
	private String history; 
	
	/** Creates new Calculator object */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
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
		history = history + " + " + value;;
	}
	
	/** subtracts a value from the current total
	 * @param value		integer to be subtracted
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;;
	}
	
	/** multiplies current total by given value
	 * @param value		integer used to multiply
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;;
	}
	
	/** divides current total by given value. If the value is 0 sets total to 0
	 * @param value		integer used to divide
	 */
	public void divide (int value) {
		// when dividing by zero set total to 0 instead of error message
		if(value == 0){
			total = 0;
		}
		
		else{
			total = total / value;
		}
		
		history = history + " / " + value;
	}
	
	/** returns a string that contains a list of the commands executed 
	 * @return		string containing commands executed
	 */
	public String getHistory () {
		return history;
	}
}