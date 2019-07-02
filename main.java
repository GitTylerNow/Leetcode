import java.util.*; 
import java.io.*;

class Main {  
  public static String FirstReverse(String str) { 
  
    //Note: Strings are immutable in Java
    //Option 1 is to build a new string and reverse the string input
    String reverse_str = "";
    for(int i = (str.length() - 1); i >= 0; i--)
        reverse_str += str.charAt(i);
    //Option 2 is to concatonate to a new string using string builder
    StringBuilder new_str = new StringBuilder();
    for(int i = (str.length() - 1); i >= 0; i--)
        new_str.append(str.charAt(i));
    //Option 3 is to use the built in reverse function. But thats not fun.
    //Therefore option 3 is to use an array of chars and flip the chars at the en and beginning of the string
    char[] my_arr = new char[str.length()];
    for(int i = 0; i <= str.length() - 1; i++)
        my_arr[i] = str.charAt(i);
    
    for(int i = 0; i < my_arr.length/2; i++){
        char placeholder = my_arr[i];
        my_arr[i] = my_arr[my_arr.length - 1- i];
        my_arr[my_arr.length - 1 - i] = placeholder;
    }

    
    for(int i = 0; i < my_arr.length; i++)
        System.out.print(my_arr[i]);

    return "";
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FirstReverse(s.nextLine())); 
  }   
  
}
