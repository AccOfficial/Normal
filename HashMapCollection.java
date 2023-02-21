import java.util.*;

public class HashMapCollection {

 public static void main(String []args){ 

 HashMap hm = new HashMap(); 

 hm.put("Ranjeet",8958.45); 

 hm.put("Mohan",8943.34); 

 hm.put("Kumar",45673.3); 

 hm.put("Deep",2121.54); 

 hm.put("Raju",9807.34); 

 

 Set set = hm.entrySet(); 

 System.out.println("Before Update:"); 

 Iterator i = set.iterator(); 

 

 while(i.hasNext()){ 

  Map.Entry me = (Map.Entry)i.next(); 

  System.out.print(me.getKey()+ ": "); 

 System.out.println(me.getValue()); 

 } 

 System.out.println(); 

 double balance = ((Double)hm.get("Ranjeet")); 

 hm.put("Ranjeet",balance + 1000); 

 System.out.print("Ranjeet new balace:" + hm.get("Ranjeet")); 

 System.out.println(); 

 System.out.println("After Update"); 

 i = set.iterator(); 

 while(i.hasNext()){ 

 Map.Entry me = (Map.Entry)i.next(); 

 System.out.print(me.getKey()+": "); 

 System.out.println(me.getValue()); 

 } 

 
 }

}