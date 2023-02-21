import java.util.*;  

public class SetDemo  

{  

    public static void main(String args[])   

{  

        //declare a set class (HashSet) 

        Set<Integer> numSet = new HashSet<Integer>(); 

        //add an element => add  

        numSet.add(13); 

        //add a list to the set using addAll method 

        numSet.addAll(Arrays.asList(new Integer[] {1,6,4,7,3,9,8,2,12,11,20}));  

        //print the set 

        System.out.println("Original Set (numSet):" + numSet); 

        //size() 

        System.out.println("\nnumSet Size:" + numSet.size()); 

        //create a new set class and initialize it with list elements 

        Set<Integer> oddSet = new HashSet<Integer>();  

        oddSet.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 9}));  

        //print the set 

        System.out.println("\nOddSet contents:" + oddSet); 

        //contains () 

        System.out.println("\nnumSet contains element 2:" + numSet.contains(3)); 

        //containsAll () 

        System.out.println("\nnumSet contains collection oddset:" +  

                numSet.containsAll(oddSet)); 

 

         // retainAll () => intersection 

        Set<Integer> set_intersection = new HashSet<Integer>(numSet);  

        set_intersection.retainAll(oddSet);  

        System.out.print("\nIntersection of the numSet & oddSet:");  

        System.out.println(set_intersection);  

 

        // removeAll () => difference  

        Set<Integer> set_difference = new HashSet<Integer>(numSet);  

        set_difference.removeAll(oddSet);  

        System.out.print("Difference of the numSet & oddSet:");  

        System.out.println(set_difference);  

          

        // addAll () => union  

        Set<Integer> set_union = new HashSet<Integer>(numSet);  

        set_union.addAll(oddSet);  

        System.out.print("Union of the numSet & oddSet:");  

        System.out.println(set_union);  

   }  

} 