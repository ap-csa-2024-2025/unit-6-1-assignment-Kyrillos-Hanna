[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=17742563)
# unit-6-1-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main.java
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

## Problem 1
Write a program that creates an array of doubles of size 3, and fills it with 3 values that have been inputted by the user.  Print the contents of the array in order, and then print the sum of the array.

No loops are required; simply index the array.

## Problem 2
Write code that asks the user for a positive number, N, and fills an array with the sums of the first n numbers up to N.  For example, if the user enters `N = 5`, then I should have an array with elements
```
{0, 1, 3, 6, 10}
```
since
* 0 = 0
* 0 + 1 = 1
* 0 + 1 + 2 = 3
* 0 + 1 + 2 + 3 = 6
* 0 + 1 + 2 + 3 + 4 = 10
