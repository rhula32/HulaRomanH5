public class SortList extends IntegerList
{
  Node current;
  
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
      
      while (isSwapped) 
      {
        isSwapped = false;
        while (current != null) 
        {
          if (current.getNextNode() != null && current.getInteger() > current.getNextNode().getInteger()) 
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