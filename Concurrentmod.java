import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Concurrentmod 
{
    public static void main (String []args)
    {
        List<String> FruitList = new ArrayList<>();
        FruitList.add("Mango");
        FruitList.add("Apple");
        FruitList.add("Banana");
        FruitList.add("Grapes");
        FruitList.add("Oranges");



      System.out.println("Original Fruit lIst");
      for (String s: FruitList)
      {
        System.out.println(s);
      }        
              // now lets try to remove an element from the list while iterating
      Iterator<String> i = FruitList.iterator();
      String str ;
      while (i.hasNext()){
        str = i.next();
        if (str.equals("Banana"))
        {
            // FruitList.remove(str); // this will throe concurrent modification exception
            i.remove(); // THIS WILL WORK s
        }
      }
         System.out.println("\nModified Fruit List:");
        for (String s : FruitList) {
            System.out.println(s);
        }
      
    }
}