package java_stuff;

public class Java_stuff {

    
    public static String convert_to_roman(int input){
        
        int num = input;
        StringBuilder str = new StringBuilder();
        char[] char_array = ("" + input).toCharArray();
        char[] reversed = new StringBuilder(new String(char_array)).reverse().toString().toCharArray();
        //Find number of 1000s(M), 500s(D), 100s(C), 50s(L), 10s(X), 5s(V), and 1s(I)
        int m = num / 1000;
        num %= 1000;
        int d = num / 500;
        num %= 500;
        int c = num / 100;
        num %= 100;
        int l = num / 50;
        num %= 50;
        int x = num / 10;
        num %= 10;
        int v = num / 5;
        num %= 5;
        int i = num / 1;
        num = input;
        
        if(input >= 100){
            //Handle 1000s
            for(int j = 0; j < m; j++){
                str.append('M');
            }
            //Handle 900, 400 cases, or else all other 500/100
            if(reversed[2] == '9'){
                str.append("CM");
            } else if (reversed[2] == '4'){
                str.append("CD");
            } else {
                if (d == 1){
                    str.append('D');
                }
                for(int j = 0; j < c; j++){
                    str.append('C');
                }
            }
        }
        
        if(input >= 10){
            //Handle 90, 40 cases, or else all other 50/10
            if(reversed[1] == '9'){
                str.append("XC");
            } else if (reversed[1] == '4'){
                str.append("XL");
            } else {
                if (l == 1){
                    str.append('L');
                }
                for(int j = 0; j < x; j++){
                    str.append('X');
                }
            }
        }
        //Handle 9, 4 cases, or else all other 5/1
        if(reversed[0] == '9'){
            str.append("IX");
        } else if (reversed[0] == '4'){
            str.append("IV");
        } else {
            if (v == 1){
                str.append('V');
            }
            for(int j = 0; j < i; j++){
                str.append('I');
            }
        }
        return str.toString();
    }
    
    
    public static void main(String[] args) {
        
        System.out.println(convert_to_roman(10));
    }
    
}
