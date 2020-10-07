package cse360assignment02;

public class AddingMachine {
  private String toPrint;
  private int total;
 /**
  * Two variables
  * toPrint to hold values added or subtrated
  * total to keep track of the total value
  */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    toPrint = Integer.toString(total);
  }
  /**
   * stores inital total value of 0
   */
  public int getTotal () {
	  return total;
  }
  /**
   * Stores total value to be added or subtracted
   */
  public void add (int value) {
	  toPrint += (" + ");
	  toPrint += (value);
	  total = getTotal() + value;
  }
/**
 * Adds parameter value to total
 * adds the sign and value to toPrint
 */
  public void subtract (int value) {
	  toPrint += (" - ");
	  toPrint += (value);
	  total = getTotal() - value;
  }
/**
 * subtracts parameter value from total
 * adds sign and value to toPrint
 */ 
  public String toString() {
	return toPrint;
  }
/**
 * Prints values that have been added
 * or subtracted
 */
  public void clear() {
	  total = 0;
	  toPrint = "";
  }
  /**
   * Clears the adding machine
   * resets total to 0
   * resets toPrint to empty
   */
}

/*
 * int yes = 4; ArrayList<String> value = new ArrayList<>(); ArrayList<Integer>
 * value1 = new ArrayList<>(); value1.add((getTotal()));
 * 
 * value.add(Integer.toString(getTotal())); if (value.get(value.size()) == "0")
 * System.out.print(value);
 * 
 * 
 * 
 * else if(value1.get(value1.size() - 1) > value1.get(value1.size())) {
 * System.out.print ("-" + " " + (value1.get(value1.size() - 1) -
 * value1.get(value1.size()))); } else if(value1.get(value1.size() - 1) <
 * value1.get(value1.size()))
 * 
 * { System.out.print("+" + " " + (value1.get(value1.size()) -
 * value1.get(value1.size()))); } return value.get(value.size());
 */