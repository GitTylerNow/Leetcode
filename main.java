import java.util.*; 
import java.io.*;


//Not sure why this was a challenge

class Main {  
  public static String CheckNums(int num1, int num2) { 
  
    if(num2 > num1)
        return "true";
    else if (num2 == num1)
        return "-1";
    else
        return "false";
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CheckNums(s.nextLine())); 
  }   
  
}
