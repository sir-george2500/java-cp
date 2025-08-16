// Issue #11: Explain why float myNum = 5.75; causes a compilation error, and how to fix it.

public class issue11{
    public static void main(String[] args){
//        float myNum = 5.75;

//        here's how to fix it.
        // Solution 1: Add f suffix
        float myNum = 5.75f;

        // Solution 2: Use casting
        //  float myNum = (float) 5.75;
        System.out.println(myNum);

/***       The error happens because 5.75 is a double by default, but float can't
 *          automatically accept double values. Adding 'f' makes it a float literal,
            or casting forces the conversion but may lose precision.
 **/
    }
}