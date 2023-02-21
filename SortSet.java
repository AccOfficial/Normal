import java.util.ArrayList; 

import java.util.Arrays; 

import java.util.Collections; 

import java.util.HashSet; 

import java.util.LinkedHashSet; 

import java.util.List; 

   

public class SortSet 

{    

    public static void main(String[] args)   

{ 

        //Declare a set and initialize it with unsorted list 

        HashSet<Integer> evenNumSet = new LinkedHashSet<>( 

                Arrays.asList(4,8,6,2,12,10,62,40,36) ); 

  

        //print the unsorted set 

        System.out.println("Unsorted Set: " + evenNumSet);  

        //convert set to list 

        List<Integer> numList = new ArrayList<Integer>(evenNumSet);   

            

        //Sort the list using Collections.sort () method 

        Collections.sort(numList); 

          

        //convert set to list   

        evenNumSet = new LinkedHashSet<>(numList);  //convert list to set 

            

        //Print the sorted set 

        System.out.println("Sorted Set:" + evenNumSet); 

        Collections.reverse(numList); 

        System.out.println("Sorted Set In Backward Direction:"+numList); 

    } 

} 