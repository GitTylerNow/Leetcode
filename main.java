class Solution {
    public boolean isPalindrome(int x) {
        
        //to check if number is palindrome, convert int to string, then check if first num = last num and so on
        String num = Integer.toString(x);
        for(int i = 0; i < num.length() / 2; i++){
            if(num.charAt(i) != num.charAt(num.length() - i - 1))
                return false;
        }
        return true;
    }
}
