public class practice{
    public static void main(String[] args){
        /**   XOR
         * sYMBOL ^
         * purpose: returns true if only one of the conditions is false (not both)
         *
         *
         * A | B | A ^ B
         * 0 | 1 | 1
         * 1 | 0 | 1
         * 0 | 0 | 0
         * 1 | 1 | 0
         *
         * A number XOR by itself is 0, while A number XOR BY 0 is that same number
         * a ^ 0 = a
         * a ^ a = 0
         */

        int a = 30;
        int b = 20;

        if((a ^ a) == 0 && (a ^ b) != 0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}

