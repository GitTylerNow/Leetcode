import java.util.*; 
import java.io.*;

class Main {  
  public static String TimeConvert(int num) { 
  
    StringBuilder derp = new StringBuilder();
    int counter = 0;
    int result = 60;
    while(result <= num){
        result += 60;
        counter++;
    }
    derp.append(counter);
    derp.append(':');
    derp.append(num%60);
       
       
    return derp.toString();
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(TimeConvert(s.nextLine())); 
  }   
  
}
