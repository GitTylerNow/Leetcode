import java.util.*; 
import java.io.*;
import java.lang.*;

class Main {  
  public static String LetterCapitalize(String str) { 
  
    
    StringBuilder result = new StringBuilder();
    char temp;
    
    //Split string by spaces
    String[] array_result = str.split(" ");
    
    for(int i = 0; i < array_result.length; i++){
        //Capitalize first letter in each string in array, append to result
        temp = array_result[i].charAt(0);
        temp = Character.toUpperCase(temp);
        result.append(temp);
        
        //Append rest of string to array
        String tmp = array_result[i].substring(1, array_result[i].length());
        result.append(tmp);
        result.append(" ");
    }

    return result.toString();
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }   
  
}
