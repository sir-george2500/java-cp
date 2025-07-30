// issue-35 Answer
//This is an example of implicit type casting(widening) in java
// firstly, I will be adding two number respectively an integer and double.
// secondly, store the result in a double variable to print or display the sum.
public class issue35 {
    public static void main( String[] args) {
        int quantitiesPurchase = 200;
        double priceOfItem = 25.50;
        double sum = quantitiesPurchase + priceOfItem;
        System.out.println("The total of " + quantitiesPurchase + " and " + priceOfItem + " is "  +  sum);

    }
}