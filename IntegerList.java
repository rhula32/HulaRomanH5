/**
 * Public Class IntegerList:
 * 1. Creates a list of random integers, with a maxiumum value of 200 & prints the unsorted list
 * 2. Contains getter & setter methods that are used when swapping places in the bubble sort
 */ 
public class IntegerList
{
  Node first;
  Node last;
  int maxInteger;

  /**
   * Constructor IntegerList:
   * 1. Constructs a list that will be filled with random numbers from 0-200
   */ 
  IntegerList() 
  { 
    this.first = null;
    this.last = null;
    this.maxInteger = 200;
  }
  
  /**
   * Method getFirst: 
   * 1. Returns the first element of the list
   * @return this.first
   */ 
  public Node getFirst() 
  {
    return this.first;
  }
  
  /**
   * Method getLast:
   * 1. Returns the last elements of the list
   * @return this.last
   */ 
  public Node getLast() 
  {
    return this.last;
  }
  
  /**
   * Method setFirst
   * 1. Sets the first and last elements of the list equal to the "newFirst" parameter
   * @param newFirst
   */ 
  public void setFirst(Node newFirst) 
  {
    if(this.first == this.last)
    {
      this.last = newFirst;
      this.first = newFirst;
    }
  }
  
  /**
   * Method setLast
   * 1. Sets the first and last elements of the list equal to the "newLast" parameter
   * @param newLast
   */ 
  public void setLast(Node newLast) 
  {
    if(this.first == this.last)
    {
      this.first = newLast;
      this.last = newLast;
    }
  }
  
  /**
   * Method getMaxInteger
   * 1. Returns the largest integer in the list
   * @return this.maxInteger
   */ 
  public int getMaxInteger() 
  {
    return this.maxInteger;
  }
  
  /**
   * Method setMaxInteger
   * 1. Sets the variable for the largest integer in the list equal to the parameter "newMaxInteger"
   * @param newMaxInteger
   */ 
  public void setMaxInteger(int newMaxInteger) 
  {
    this.maxInteger = newMaxInteger;
  }
  
  /**
   * Method randomGenerator
   * 1. Generates a list of random integers between 0 and 200
   * 2. The number of elements in the list (parameter listLength) is hard-coded into the main method
   * @param listLength
   */ 
  public void randomGenerator(int listLength) 
  {
    for(int i = 0; i < listLength; i++) 
    {
      Node newNode = new Node((int) (Math.random() * this.maxInteger));
      if(isEmpty()) 
      {
        this.first = newNode;
        this.last = newNode;
      }
      else 
      {
        newNode.setNextNode(first);
        first.setPrevNode(newNode);
        this.first = newNode;
      }
    }
  }
  
  /**
   * Method isEmpty
   * 1. Returns the value of the first element of the list if the list is empty, which would be null
   * @return this.first
   */ 
  public boolean isEmpty() 
  {
    return this.first == null;
  }
  
  /**
   * Method printUnsorted
   * 1. Prints the list of random numbers before they are sorted
   * 2. Allows us to compare the list of random numbers before & after sorting
   */
  public void printUnsorted() 
  {
    Node current = this.first;
    System.out.println("Printing the unsorted list: ");
    while(current != null) 
    {
      current.print();
      current = current.getNextNode();
    }
    System.out.println("");
  }
}