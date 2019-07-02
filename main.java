import java.util.*; 
import java.io.*;

class Main {  
  public static String LetterChanges(String str) { 
  

    StringBuilder new_str = new StringBuilder();
    
    for(int i = 0; i < str.length(); i++){
        
        int current = (int) str.charAt(i);
        //Case 1: current letter is capital, not Z. Increment by 1 ascii dec val
        if (current >= 65 && current <= 89) {
            current ++;
        //Case 2: current letter is Z. Change to A
        } else if (current == 90){
            current = 65;
        //Case 3: current letter is lowercase, not z. Increment by 1. If vowel, change to capital case
        } else if (current >= 97 && current <= 121){
            //increment by 1
            current++;
            switch(current){
            case 101: //e
                current = 69;
                break;
            case 105: //i
                current = 73;
                break;
            case 111: //o
                current = 79;
                break;
            case 117: //u
                current = 85;
                break;
            }
        //Case 4: current letter is z. Change to A
        } else if(current == 122) {
            current = 65;
        } 
        new_str.append((char) current);


        
    }

    System.out.print(new_str.toString());
       
    return "";
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }   
  
}
