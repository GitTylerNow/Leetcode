import java.util.*; 
import java.io.*;

class Main {  
  public static int SimpleAdding(int num) { 
  
    /*recursive solution
    if(num != 0)
        return num + SimpleAdding(num - 1);
    else
        return num;
     */
     
     //Completely forgot this was a formula n(n+1)/2
     //Sum of first n consecutive natural numbers formula, Gauss?
    return (num*(num+1)/2);
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleAdding(s.nextLine())); 
  }   
  
}
