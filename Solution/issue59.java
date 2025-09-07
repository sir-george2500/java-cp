// Q59. Which method of GregorianCalendar is used to check if a year is a leap year, and how would you use it in a program?
//
// Answer. The method used to in the GregorianCalendar to check the leap year is the isLeapYear() method that the year is then passed on as a parameter or argument. The usage of the method is as provided below:
//

import java.util.*;

public class issue59 {

   public static void main(String args[]) {
   
    int year;
   
    GregorianCalendar gcalendar = new GregorianCalendar();
   
    if(gcalendar.isLeapYear(year)) {
      System.out.println("The current year is a leap year");
    }else {
      System.out.println("The current year is not a leap year");
    }
   }
}

