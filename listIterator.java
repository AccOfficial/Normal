import java.util.ArrayList;

import java.util.List;

import java.util.ListIterator;

public class listIterator

{

  public static void main(String a[]) 

  { 

    ListIterator<String> litr = null; 

    List<String> names = new ArrayList<String>(); 

    names.add("Maharashtra"); 

    names.add("Goa"); 

    names.add("Gujarat"); 

    names.add("Punjab"); 

    names.add("Madhya Pradesh"); 

    //Obtaining list iterator 

    litr=names.listIterator(); 

  

    System.out.println("Traversing the list in forward direction:"); 

    while(litr.hasNext()) 

{ 

       System.out.println(litr.next()); 

    } 

    System.out.println("\nTraversing the list in backward direction:"); 

    while(litr.hasPrevious()) 

{ 

       System.out.println(litr.previous()); 

    } 
}
}