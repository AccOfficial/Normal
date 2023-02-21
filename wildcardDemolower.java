import java.util.Arrays; 

import java.util.List; 

class wildcardDemolower 

{ 

public static void main(String args[]) 

{ 

List<Integer>list1=Arrays.asList(4,5,6,7); 

printOnlyIntegerClassorSuperClass(list1); 

List<Double>list2=Arrays.asList(4.1,5.1,6.1,7.1); 

printOnlyDClassorSuperClass(list2); 

} 

public static void printOnlyIntegerClassorSuperClass(List<? super Integer>list) 

{ 

System.out.println(list); 

} 

public static void printOnlyDClassorSuperClass(List <?super Double>list2) 

{ 

System.out.println(list2);	 

} 

} 