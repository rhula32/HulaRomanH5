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