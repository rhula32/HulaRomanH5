/**
 * Public Class SortList:
 * 1. Implements the bubble sort method to the unsorted list of random integers & prints the sorted list
 * 2. Extend the IntegerList class
 * 3. The only reason this is separate from the IntegerList class is so the bubble sort method is easier to observe
 */ 
public class SortList extends IntegerList
{
  Node current;
  
  /**
   * Method bubbleSort
   * 1. A bubble-sort algorithm sorts the list of random integers using while loops & "if" statements
   * 2. The loops & statements determine if the integers are greater than or less than the next value in the list
   * 3. The loops repeat until the entire list is traversed & the integers are sorted from lowest to highest
   */ 
  public void bubbleSort()
  {
    if(isEmpty())
    {
      System.out.println("The list is empty & therefore cannot be sorted"); 
    }
    else 
    {
      current = first;
      boolean isSwapped = true;
      
      while(isSwapped) 
      {
        isSwapped = false;
        while(current != null) 
        {
          if(current.getNextNode() != null && current.getInteger() > current.getNextNode().getInteger()) 
          {
            int temp = current.getInteger();
            current.setInteger(current.getNextNode().getInteger());
            current.getNextNode().setInteger(temp);
            isSwapped = true;
          }
          current = current.getNextNode();
        }
        current = first;
      }
    }
  }
  
  /**
   * Method printSorted
   * 1. Prints the sorted list using a while loop
   */ 
  public void printSorted() 
  {
    Node current = this.first;
    System.out.println("Printing the sorted list: ");
    while(current != null) 
    {
      current.print();
      current = current.getNextNode();
    }
    System.out.println("");
  }
}