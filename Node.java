/**
 * Public Class Node:
 * 1. Provides node functions to create a doubly-linked list
 * 2. Includes getters & setters to swap nodes in the bubble sort method
 */ 
public class Node 
{
  public int integer;
  public Node prevNode;
  public Node nextNode;

  /**
   * Constructor Node
   * 1. Constructs the nodes that are part of the linked list
   * @param i
   */ 
  Node(int i) 
  { 
    this.integer = i; 
    this.prevNode = null;
    this.nextNode = null;
  }
  
  /**
   * Method getInteger
   * 1. Returns the value of the node
   * @return this.integer
   */ 
  public int getInteger()
  {
    return this.integer;
  }
  
  /**
   * Method getPrevNode
   * 1. Returns the node that is 1 place behind the current node
   * @return this.prevNode
   */ 
  public Node getPrevNode()
  {
    return this.prevNode;
  }
  
  /**
   * Method getNextNode
   * 1. Returns the node that is 1 place ahead of the current node
   * @return this.nextNode
   */ 
  public Node getNextNode() 
  {
    return this.nextNode;
  }
  
  /**
   * Method setInteger
   * 1. Sets the value of "this.integer" equal to the parameter "newInteger"
   * @param newInteger
   */ 
  public void setInteger(int newInteger) 
  {
    this.integer = newInteger;
  }
  
  /**
   * Method setPrevNode
   * 1. Sets the element of the node behind the current node to "newPrevNode"
   * @param newPrevNode
   */ 
  public void setPrevNode(Node newPrevNode) 
  {
    this.prevNode = newPrevNode;
  }
  
  /**
   * Method setNextNode
   * 1. Sets the element of the node ahead of the current node to "newNextNode"
   * @param newNextNode
   */ 
  public void setNextNode(Node newNextNode) 
  {
    this.nextNode = newNextNode;
  }
  
  /**
   * Method print
   * 1. Prints the elements of the node object
   */ 
  public void print() 
  {
    System.out.print(integer + " " );
  }
}