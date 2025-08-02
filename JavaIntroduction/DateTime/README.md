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

# Date Formatting Using `printf`

Date and time formatting can be done very easily using the `printf` method.  
You use a two-letter format, starting with `t` and ending with one of the letters from the table as shown in the following code.

```java

import java.util.Date;
public class DateDemo {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();

      // display time and date
      String str = String.format("Current Date/Time : %tc", date );

      System.out.printf(str);
   }
}
```

### output 

```java 

Current Date/Time : Sat Dec 15 16:37:57 MST 2012

```
```java 
```
import java.util.Date;
public class DateDemo {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();
  
      // display formatted date
      System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
   }
}
```
```
```


# Date and Time Conversion Characters

| Character | Description                                   | Example                      |
|-----------|-----------------------------------------------|-----------------------------|
| c         | Complete date and time                         | Mon May 04 09:51:52 CDT 2009|
| F         | ISO 8601 date                                 | 2004-02-09                  |
| D         | U.S. formatted date (month/day/year)          | 02/09/2004                  |
| T         | 24-hour time                                  | 18:05:19                    |
| r         | 12-hour time                                  | 06:05:19 pm                 |
| R         | 24-hour time, no seconds                      | 18:05                       |
| Y         | Four-digit year (with leading zeroes)        | 2004                        |
| y         | Last two digits of the year (with leading zeroes) | 04                     |
| C         | First two digits of the year (with leading zeroes) | 20                     |
| B         | Full month name                               | February                    |
| b         | Abbreviated month name                        | Feb                         |
| m         | Two-digit month (with leading zeroes)         | 02                          |
| d         | Two-digit day (with leading zeroes)            | 03                          |
| e         | Two-digit day (without leading zeroes)         | 9                           |
| A         | Full weekday name                             | Monday                      |
| a         | Abbreviated weekday name                      | Mon                         |
| j         | Three-digit day of year (with leading zeroes) | 069                         |
| H         | Two-digit hour (with leading zeroes), between 00 and 23 | 18                  |
| k         | Two-digit hour (without leading zeroes), between 0 and 23 | 18                  |
| I         | Two-digit hour (with leading zeroes), between 01 and 12 | 06                  |
| l         | Two-digit hour (without leading zeroes), between 1 and 12 | 6                   |
| M         | Two-digit minutes (with leading zeroes)       | 05                          |
| S         | Two-digit seconds (with leading zeroes)       | 19                          |
| L         | Three-digit milliseconds (with leading zeroes) | 047                        |
| N         | Nine-digit nanoseconds (with leading zeroes)  | 047000000                   |
| P         | Uppercase morning or afternoon marker          | PM                          |
| p         | Lowercase morning or afternoon marker          | pm                          |
| z         | RFC 822 numeric offset from GMT                | -0800                       |
| Z         | Time zone                                      | PST                         |
| s         | Seconds since 1970-01-01 00:00:00 GMT          | 1078884319                  |
| Q         | Milliseconds since 1970-01-01 00:00:00 GMT     | 1078884319047               |

There are other useful classes related to Date and Time.  
For more details, you can refer to the [Java Standard Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html).


# Parsing Strings into Dates

The `SimpleDateFormat` class has some additional methods, notably `parse()`,  
which tries to parse a string according to the format stored in the given `SimpleDateFormat` object.

## Example

```java 

import java.util.*;
import java.text.*;
  
public class DateDemo {

   public static void main(String args[]) {
      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
      String input = args.length == 0 ? "1818-11-11" : args[0]; 

      System.out.print(input + " Parses as "); 
      Date t;
      try {
         t = ft.parse(input); 
         System.out.println(t); 
      } catch (ParseException e) { 
         System.out.println("Unparseable using " + ft); 
      }
   }
```


### Output
```java 
```
1818-11-11 Parses as Wed Nov 11 00:00:00 EST 1818
```



# Sleeping for a While

You can sleep for any period of time from one millisecond up to the lifetime of your computer.  
For example, the following program would sleep for 3 seconds:


import java.util.*;
public class SleepDemo {

   public static void main(String args[]) {
      try { 
         System.out.println(new Date( ) + "\n"); 
         Thread.sleep(5*60*10); 
         System.out.println(new Date( ) + "\n"); 
      } catch (Exception e) {
         System.out.println("Got an exception!"); 
      }
   }
}

## Output
```java 
Sun May 03 18:04:41 GMT 2009
Sun May 03 18:04:51 GMT 2009

```


# Measuring Elapsed Time

Sometimes, you may need to measure point in time in milliseconds. So let's re-write the above example once again −
```

```java 

public class DiffDemo {

   public static void main(String args[]) {
      try {
         long start = System.currentTimeMillis( );
         System.out.println(new Date( ) + "\n");
         
         Thread.sleep(5*60*10);
         System.out.println(new Date( ) + "\n");
         
         long end = System.currentTimeMillis( );
         long diff = end - start;
         System.out.println("Difference is : " + diff);
      } catch (Exception e) {
         System.out.println("Got an exception!");
      }
   }
}

```



# GregorianCalendar Class

`GregorianCalendar` is a concrete implementation of the `Calendar` class that implements the normal Gregorian calendar you are familiar with.  
This tutorial does not cover the `Calendar` class in detail; you can refer to the standard Java documentation for more information.

The `getInstance()` method of `Calendar` returns a `GregorianCalendar` initialized with the current date and time in the default locale and time zone.  
`GregorianCalendar` defines two fields: **AD** and **BC**, representing the two eras defined by the Gregorian calendar.

---

## Constructors for GregorianCalendar Objects

| Sr.No. | Constructor & Description |
|--------|----------------------------|
| 1 | **GregorianCalendar()**<br>Constructs a default `GregorianCalendar` using the current time in the default time zone with the default locale. |
| 2 | **GregorianCalendar(int year, int month, int date)**<br>Constructs a `GregorianCalendar` with the given date set in the default time zone with the default locale. |
| 3 | **GregorianCalendar(int year, int month, int date, int hour, int minute)**<br>Constructs a `GregorianCalendar` with the given date and time set for the default time zone with the default locale. |
| 4 | **GregorianCalendar(int year, int month, int date, int hour, int minute, int second)**<br>Constructs a `GregorianCalendar` with the given date and time set for the default time zone with the default locale. |
| 5 | **GregorianCalendar(Locale aLocale)**<br>Constructs a `GregorianCalendar` based on the current time in the default time zone with the given locale. |
| 6 | **GregorianCalendar(TimeZone zone)**<br>Constructs a `GregorianCalendar` based on the current time in the given time zone with the default locale. |
| 7 | **GregorianCalendar(TimeZone zone, Locale aLocale)**<br>Constructs a `GregorianCalendar` based on the current time in the given time zone with the given locale. |

---

## Useful Methods Provided by GregorianCalendar Class

| Sr.No. | Method & Description |
|--------|-----------------------|
| 1  | **void add(int field, int amount)**<br>Adds the specified (signed) amount of time to the given time field, based on the calendar's rules. |
| 2  | **protected void computeFields()**<br>Converts UTC milliseconds to time field values. |
| 3  | **protected void computeTime()**<br>Overrides `Calendar` method to convert time field values to UTC milliseconds. |
| 4  | **boolean equals(Object obj)**<br>Compares this `GregorianCalendar` to an object reference. |
| 5  | **int get(int field)**<br>Gets the value for a given time field. |
| 6  | **int getActualMaximum(int field)**<br>Returns the maximum value that this field could have, given the current date. |
| 7  | **int getActualMinimum(int field)**<br>Returns the minimum value that this field could have, given the current date. |
| 8  | **int getGreatestMinimum(int field)**<br>Returns highest minimum value for the given field if varies. |
| 9  | **Date getGregorianChange()**<br>Gets the Gregorian Calendar change date. |
| 10 | **int getLeastMaximum(int field)**<br>Returns lowest maximum value for the given field if varies. |
| 11 | **int getMaximum(int field)**<br>Returns maximum value for the given field. |
| 12 | **Date getTime()**<br>Gets this Calendar's current time. |
| 13 | **long getTimeInMillis()**<br>Gets this Calendar's current time as a long. |
| 14 | **TimeZone getTimeZone()**<br>Gets the time zone. |
| 15 | **int getMinimum(int field)**<br>Returns minimum value for the given field. |
| 16 | **int hashCode()**<br>Overrides `hashCode`. |
| 17 | **boolean isLeapYear(int year)**<br>Determines if the given year is a leap year. |
| 18 | **void roll(int field, boolean up)**<br>Adds or subtracts (up/down) a single unit of time on the given time field without changing larger fields. |
| 19 | **void set(int field, int value)**<br>Sets the time field with the given value. |
| 20 | **void set(int year, int month, int date)**<br>Sets the values for the fields year, month, and date. |
| 21 | **void set(int year, int month, int date, int hour, int minute)**<br>Sets the values for the fields year, month, date, hour, and minute. |
| 22 | **void set(int year, int month, int date, int hour, int minute, int second)**<br>Sets the values for the fields year, month, date, hour, minute, and second. |
| 23 | **void setGregorianChange(Date date)**<br>Sets the GregorianCalendar change date. |
| 24 | **void setTime(Date date)**<br>Sets this Calendar's current time with the given Date. |
| 25 | **void setTimeInMillis(long millis)**<br>Sets this Calendar's current time from the given long value. |
| 26 | **void setTimeZone(TimeZone value)**<br>Sets the time zone with the given time zone value. |
| 27 | **String toString()**<br>Returns a string representation of this calendar. |

```java 

import java.util.*;
public class GregorianCalendarDemo {

   public static void main(String args[]) {
      String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
         "Oct", "Nov", "Dec"};
      
      int year;
      // Create a Gregorian calendar initialized
      // with the current date and time in the
      // default locale and timezone.
      
      GregorianCalendar gcalendar = new GregorianCalendar();
      
      // Display current time and date information.
      System.out.print("Date: ");
      System.out.print(months[gcalendar.get(Calendar.MONTH)]);
      System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
      System.out.println(year = gcalendar.get(Calendar.YEAR));
      System.out.print("Time: ");
      System.out.print(gcalendar.get(Calendar.HOUR) + ":");
      System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
      System.out.println(gcalendar.get(Calendar.SECOND));

      // Test if the current year is a leap year
      if(gcalendar.isLeapYear(year)) {
         System.out.println("The current year is a leap year");
      }else {
         System.out.println("The current year is not a leap year");
      }
   }
}

```

### Output 
```java 

Output

Date: Apr 22 2009
Time: 11:25:27
The current year is not a leap year
```


```
```
```
```
```
```
```
```
```
