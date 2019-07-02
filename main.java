package java_stuff;

public class Java_stuff {

    
        public static double find_median(int[] arr){
        
        int length = arr.length;
        double median = 0.0;
        int int1, int2;
        //Case 0: length 1
        if(length == 1){
            return (double)arr[0];
        //Case 1: odd length > 1
        } else if(length % 2 != 0){
            length /= 2;
            median = arr[length];
        //Case 2: even length
        } else {
            int1 = arr[length/2];
            int2 = arr[length/2 - 1];
            median = (int1 + int2) / 2.0;
        }
        return median;
            
    }
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int array1_lenth = nums1.length;
        int array2_length = nums2.length;
        int length = (nums1.length + nums2.length);
        int [] new_array = new int [length];
        
        //Case 1: first array is empty
        if(array1_lenth == 0){
            return find_median(nums2);
        //Case 2: second array is empty
        } else if (array2_length == 0){
            return find_median(nums1);
        /*Case 3: both are nonempty. Merge arrays
        *To merge sorted arrays, traverse both initial arrays simultaneously, 
        *adding the lesser value. Once one array is completed, just add remaining array values
        */
        } else{
            int index1 = 0;
            int index2 = 0;
            int temp1 = nums1[0];
            int temp2 = nums2[0];
            
            for(int i = 0; i < length; i++){
                if(index1 >= nums1.length){
                    new_array[i] = temp2;
                    index2++;
                    if(index2 < nums2.length)
                        temp2 = nums2[index2];
                } else if(index2 >= nums2.length){
                    new_array[i] = temp1;
                    index1++;
                    if(index1 < nums1.length)
                        temp1 = nums1[index1];
                } else if (temp1 < temp2){
                    new_array[i] = temp1;
                    index1++;
                    if(index1 < nums1.length)
                        temp1 = nums1[index1];
                } else {
                    new_array[i] = temp2;
                    index2++;
                    if(index2 < nums2.length)
                        temp2 = nums2[index2];
                }
            }
            return find_median(new_array);
        }
    }
    
}
