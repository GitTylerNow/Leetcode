import java.util.*; 
import java.io.*;
import java.lang.*;

class Main {  
    
    public static boolean isLetter(char ch){
        
        int num = (int) ch;
        if(num >= 65 && num <= 90)
            return true;
            
        if(num >= 97 && num <= 122)
            return true;
            
        return false;
            //Capital is 65-90
            //lower is 97-122
    }
    public static boolean SimpleSymbols(String str) { 
  
        char balls = str.charAt(0);
        //Check first letter if valid 
        if(isLetter(balls))
            return false;
        
        //Check remaining letters
        for(int i = 1; i < str.length(); i++){
            if(isLetter(str.charAt(i))){
                
                //Must be surrounded by '+' symbol
                if((str.charAt(i-1) != '+') || (str.charAt(i+1) != '+'))
                    return false;
            }
        }
        
    
    
    
    return true;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleSymbols(s.nextLine())); 
  }   
  
}
