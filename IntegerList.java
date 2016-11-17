public class IntegerList
{
  Node first;
  Node last;
  int maxInteger;

  IntegerList() 
  { 
    this.first = null;
    this.last = null;
    this.maxInteger = 200;
  }
  
  public Node getFirst() 
  {
    return this.first;
  }
  
  public Node getLast() 
  {
    return this.last;
  }
  
  public void setFirst(Node newFirst) 
  {
    if (this.first == this.last)
    {
      this.last = newFirst;
      this.first = newFirst;
    }
  }
  
  public void setLast(Node newLast) 
  {
    if (this.first == this.last)
    {
      this.first = newLast;
      this.last = newLast;
    }
  }
  
  public int getMaxInteger() 
  {
    return this.maxInteger;
  }
  
  public void setMaxInteger(int newMaxInteger) 
  {
    this.maxInteger = newMaxInteger;
  }
  
  public void randomGenerator(int listLength) 
  {
    for (int i = 0; i < listLength; i++) 
    {
      Node newNode = new Node((int) 
                                (Math.random() * this.maxInteger));
      if (isEmpty()) 
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
  
  public void addInteger(int newInteger) 
  {
    Node newNode = new Node(newInteger);
    
    if (this.isEmpty()) 
    {
      this.first = newNode;
      this.last = newNode;
    }
    else 
    {
      Node current = this.first;
      
      while(current != null) 
      {
        if (current != null && newNode.getInteger() < current.getInteger()) 
        {
          newNode.setNextNode(this.first);
          this.first = newNode;
          current.setPrevNode(newNode);
          break;
        }
        else if (newNode.getInteger() < current.getNextNode().getInteger()) 
        {
          newNode.setNextNode(current.getNextNode());
          current.getNextNode().setPrevNode(newNode);
          current.setNextNode(newNode);
          newNode.setPrevNode(current);
          break;
        }
        else if (current.getNextNode() == null) 
        {
          current.setNextNode(newNode);
          newNode.setPrevNode(current);
          this.last = newNode;
          break;
        }
        current = current.getNextNode();
      }
    }
  }
  
  public boolean isEmpty() 
  {
    return this.first == null;
  }
  
  public void print() 
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