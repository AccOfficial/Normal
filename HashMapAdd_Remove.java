import java.util.*;   

public class HashMapAdd_Remove  

{   

   public static void main(String args[])  

   {   

    HashMap<Integer,String> map=new HashMap<Integer,String>();           

      map.put(21115,"Sahil");     

      map.put(21111,"Sherrin");     

      map.put(21123,"Sahil");   

      map.put(21131, "Aditya");  

 

    HashMap<Integer,String> map2=new HashMap<Integer,String>();   

 map2.put(2230, "Mayur"); 

     map2.put(2235, "Jayesh"); 

  

 // Copying one HashMap "hmap" to another HashMap "map2" 

     map2.putAll(map); 

  

  // Displaying HashMap "hmap2" content 

     System.out.println("\t HashMap 2 contains: "+ map2); 

 System.out.println("\t Initial list of elements: "+map);  

 

//key-based search 

String value = map.get(1); 

    System.out.println("\t Value at index 1: " + value); 

 

//key/value mapping 

    System.out.println("\t key/value: " + map.entrySet()); 

 

    //key-based removal   

    map.remove(21115);   

    System.out.println("\t Updated list of elements: "+map);   

    //value-based removal   

    map.remove(21111);   

    System.out.println("\t Updated list of elements: "+map);   

    //key-value pair based removal   

    map.remove(21123);   

    System.out.println("\t Updated list of elements: "+map);  

 

   }       

}   