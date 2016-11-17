public class SortList extends IntegerList
{
  public void print() 
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
  
  public void sort() 
  {
    this.first = this.sort(this.first, this.maxInteger);
    Node current = this.first;
    while (current.getNextNode() != null) 
    {
      current = current.getNextNode();
    }
    this.last = current; 
  }
  
  public Node sort(Node listFirst, int lastValue) 
  {
    if ((listFirst.getNextNode() == null) || (listFirst.getNextNode().getInteger() >= lastValue)) 
    {
      return (listFirst);
    }
    else 
    {
      Node low = null;
      Node high = null;
      Node tmp = null;
      Node current = first;
      while (current != null) 
      {
        tmp = current;
        current = current.getNextNode();
        if (tmp.getInteger() < lastValue/2) 
        {
          if (low == null)
          {
            low = tmp;
          }
          else 
          {
            tmp.setNextNode(low);
            low.setPrevNode(tmp);
            low = tmp;
          }
        } 
        else 
        {
          if (high == null)
          {
            high = tmp;
          }
          else 
          {
            tmp.setNextNode(high);
            high.setPrevNode(tmp);
            high = tmp;
          }
        }
      }
      current = low;
      while (current.getNextNode().getInteger() < lastValue/2) 
      {
        current = current.getNextNode(); 
      }
      high.setPrevNode(current);
      current.setNextNode(high);
      low = sort(low, lastValue/2);
      high = sort(high, lastValue*3/4);
      return(low);
    }
  }
}