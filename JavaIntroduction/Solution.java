public class Solution{
    public static void main(String[] args){
// declare a char variable grade and assign it the character 'A' #9
        char grade = 'A';
        System.out.println("Grade: "+ grade);

//        Issue #17 variable reassignment output
        issue17Output();
    }


//    Issue #17
    public static void issue17Output(){
        int myNum = 10;
        myNum = 20;
        System.out.println("Issue #17 - Output: " + myNum);
    }
}