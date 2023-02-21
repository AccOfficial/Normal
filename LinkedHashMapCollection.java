import java.util.*;

public class LinkedHashMapCollection {

 public static void main(String[] args){ 

 System.out.println("Collection - LinkedHashMap\n"); 

 LinkedHashMap carData = new LinkedHashMap(); 

 String car1 = "Mercedes"; 

 String car2 = "BMW"; 

 String car3 = "jaguar"; 

 String car4 = "Rolls Roys"; 

 carData.put(car1,"5000000"); 

 carData.put(car2,"7000000"); 

 carData.put(car3,"9000000"); 

 carData.put(car4,"10000000"); 

 System.out.println("Car data:"); 

 Iterator iterator = carData.keySet().iterator(); 

 Object obj; 

 while(iterator.hasNext()){ 

 obj = iterator.next(); 

 System.out.println(obj +": "+ carData.get(obj)); 

 } 

 System.out.println(); 

 int size = carData.size(); 

 if(carData.isEmpty()){ 

 System.out.println("Collection is empty"); 

 } else{ 

 System.out.println("Collection size:"+size); 

 } 

 System.out.println( carData.remove(car2)); 

 System.out.println("After removing["+ car2 +"]\n"); 

 System.out.println("Now colletion data:"); 

 iterator = carData.keySet().iterator(); 

 while (iterator.hasNext()){ 

 obj = iterator.next(); 

 System.out.println(obj + ": "+ carData.get(obj)); 

 } 

 System.out.println(); 

 size = carData.size(); 

 System.out.println("Collection size:" + size+"\n"); 

 carData.clear(); 

 size = carData.size(); 

 if(carData.isEmpty()){ 

 System.out.println("Collection is empty"); 

 }else{ 

 System.out.println("Collection size:" + size); 

 } 

 }

}