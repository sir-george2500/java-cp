# Java `Date` Class

Java provides the **Date** class available in the `java.util` package. This class encapsulates the current date and time.

The Date class supports two constructors as shown in the following table:

| Sr.No. | Constructor & Description |
|--------|----------------------------|
| 1 | **Date()**<br>This constructor initializes the object with the current date and time. |
| 2 | **Date(long millisec)**<br>This constructor accepts an argument that equals the number of milliseconds that have elapsed since midnight, January 1, 1970. |

---

## Methods of the Date Class

Following are the commonly used methods of the `Date` class:

| Sr.No. | Method & Description |
|--------|-----------------------|
| 1 | **boolean after(Date when)**<br>This method tests if this date is after the specified date. |
| 2 | **boolean before(Date when)**<br>This method tests if this date is before the specified date. |
| 3 | **Object clone()**<br>This method returns a copy of this object. |
| 4 | **int compareTo(Date anotherDate)**<br>This method compares two dates for ordering. |
| 5 | **boolean equals(Object obj)**<br>This method compares two dates for equality. |
| 6 | **static Date from(Instant instant)**<br>This method obtains an instance of Date from an Instant object. |
| 7 | **long getTime()**<br>This method returns the number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object. |
| 8 | **int hashCode()**<br>This method returns a hash code value for this object. |
| 9 | **void setTime(long time)**<br>This method sets this Date object to represent a point in time that is `time` milliseconds after January 1, 1970 00:00:00 GMT. |
| 10 | **Instant toInstant()**<br>This method converts this Date object to an Instant. |
| 11 | **String toString()**<br>This method converts this Date object to a String representation. |



# Date Comparison

Following are three ways to compare two dates:

1. Use `getTime()` to obtain the number of milliseconds that have elapsed since midnight, January 1, 1970, for both objects and then compare these two values.

2. Use the methods `before()`, `after()`, and `equals()`.  
   For example, because the 12th of the month comes before the 18th,  
   `new Date(99, 2, 12).before(new Date(99, 2, 18))` returns `true`.

3. Use the `compareTo()` method, which is defined by the `Comparable` interface and implemented by `Date`.

---

## Example

```java
import java.util.Date;

public class DateComparisonExample {
    public static void main(String[] args) {
        Date date1 = new Date(99, 2, 12); // March 12, 1999
        Date date2 = new Date(99, 2, 18); // March 18, 1999

        // 1. Compare using getTime()
        if (date1.getTime() < date2.getTime()) {
            System.out.println("date1 is before date2 using getTime()");
        }

        // 2. Compare using before(), after(), equals()
        if (date1.before(date2)) {
            System.out.println("date1 is before date2 using before()");
        }

        // 3. Compare using compareTo()
        int comparison = date1.compareTo(date2);
        if (comparison < 0) {
            System.out.println("date1 is before date2 using compareTo()");
        } else if (comparison == 0) {
            System.out.println("date1 is equal to date2");
        } else {
            System.out.println("date1 is after date2");
        }
    }
}

```

# Date Formatting Using SimpleDateFormat

`SimpleDateFormat` is a concrete class for formatting and parsing dates in a locale-sensitive manner.  
It allows you to start by choosing any user-defined patterns for date-time formatting.

```java
```
import java.util.*;
import java.text.*;

public class DateDemo {

   public static void main(String args[]) {
      Date dNow = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(dNow));
   }
}
```
```
