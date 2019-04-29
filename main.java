//https://leetcode.com/problems/perfect-number/submissions/

public static boolean checkPerfectNumber(int num) {
        if(num < 0)
            return false;
        else if(num == 0)
            return false;
        
        Stack<Integer> stack = new Stack<Integer>(); 
        int checker = 0;
        for(int i = 1; i < num/2 + 1; i++){
            if(num % i == 0)
                stack.push(i);
        }
        while(!stack.isEmpty()){
            checker += stack.pop();
        }
        
        if(checker == num)
            return true;
        return false;
    }
