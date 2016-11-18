/**
 * Public Class Testing:
 * 1. Constructs a new list of random integers, with the amount of integers hard-coded into the method
 * 2. Prints the unsorted contents of the newly constructed list
 * 3. Calls the bubbleSort method to sort the newly constructed list
 * 4. Prints the sorted contents of the newly constructed list from lowest to highest value
 */ 
public class Testing 
{
  public static void main (String [] args) 
  {
    SortList myList = new SortList();
    
    myList.randomGenerator(100);
    myList.printUnsorted();
    System.out.println();
    myList.bubbleSort();
    myList.printSorted();
  }
}