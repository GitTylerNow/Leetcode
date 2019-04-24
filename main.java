//https://leetcode.com/problems/base-7/
class Solution {
    public String convertToBase7(int num) {
        boolean is_negative = false;
        if(num < 0){
            is_negative = true;
            num *= -1;
        }
        if (num == 0){
            return "0";
        } else if (num < 7){
            if(is_negative)
                num *= -1;
            return Integer.toString(num);
        }
        
        int i = 1;
        int counter = 0; 
        int temp = 0;
        int[] my_arr;
        
        
        while(i <= num){
            i *= 7;
            counter ++;
        }

        my_arr = new int [counter];
        i /= 7;
        counter--;
        
        
        while(num != 0){
            temp = num/i;
            num %= i;
            i /= 7;
            my_arr[counter] = temp;
            counter--;
        }
        
        StringBuilder results = new StringBuilder();
        if(is_negative)
            results.append('-');
        for(int j = my_arr.length; j > 0; j--){
            results.append(my_arr[j-1]);
        }
        
        return results.toString();
    
    }
}
