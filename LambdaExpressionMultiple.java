interface Addition 

{ 

int add(int a, int b); 

} 

interface Subtract 

{ 

int sub(int a, int b); 

} 

interface Mullti 

{ 

int mul(int a, int b); 

} 

 

public class LambdaExpressionMultiple 

{   

    public static void main(String[] args)  

{   

        //Addition 

Addition add2 = (a, b) -> (a+b); 

System.out.println("\t Addition of a and b : "+add2.add(50,50)); 

 

//Subtraction 

Subtract sub1 = (a,b) -> (a-b); 

System.out.println("\t Subtraction of a and b : "+sub1.sub(50,50)); 

 

//Multiplication 

Mullti mult = (a,b) -> (a*b); 

System.out.println("\t Multiplication of a and b :"+mult.mul(50,50)); 

    }   

}   