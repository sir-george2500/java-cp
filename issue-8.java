// Issue #8: Why do you need to suffix a number with L when assigning it to a long variable?


// Numeric literals in Java are treated as int by default (unless they have a suffix)
//L suffix tells the compiler to treat the number as a long literal instead of int
//Int range is limited: -2,147,483,648 to 2,147,483,647 (32-bit)
//Long range is much larger: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (64-bit)
//Automatic widening works for small numbers (int can be automatically converted to long)
//Large numbers beyond int range MUST use L suffix or compilation will fail
//Without L suffix, large numbers cause compilation errors because they exceed int capacity
//Best practice: Always use uppercase L instead of lowercase l (looks like number 1)

//This demonstrates why the L suffix is essential when working with large numbers that exceed the int range.
// Without it, Java cannot determine that you want a long literal, leading to compilation errors for values
// outside the int range.

