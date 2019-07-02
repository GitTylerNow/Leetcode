package java_stuff;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Java_stuff {
    public static int longestConsecutive(int[] nums) {
        //Edge case empty array
        if(nums.length == 0)
            return 0;
        //Edge case array size 1
        if(nums.length == 1)
            return 1;
        
        //Remove duplicates
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        long[] new_nums = new long[set.size()];
        int j = 0;
        for(int k: set)
            new_nums[j++] = k;
        //Sort the array
        Arrays.sort(new_nums);
        
        //Count number of times following number is current+1
        int count = 1;
        int temp_counter = 1;
        
        for(int i = 1; i < new_nums.length; i++){
            if((new_nums[i]) == new_nums[i-1] + 1){
                temp_counter++;
            } else {
                if(count < temp_counter)
                    count = temp_counter;
                temp_counter = 1;
            }
        }
        if(count < temp_counter)
            count = temp_counter;
        
        return count;
    }
    
    public static void main(String[] args) {
        //Sort array
        int[] nums = {2147483646,-2147483647,0,2,2147483644,-2147483645,2147483645};
        System.out.println(longestConsecutive(nums));
        
    }
}
