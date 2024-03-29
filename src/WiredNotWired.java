/* This is a Hackerrank Problem. Wired Not Wired problem if-else.
In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

Wikipedia if-else flow chart

Source: Wikipedia

Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird */


import java.util.*;


public class WiredNotWired {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if((N%2)!=0)
            System.out.println("Weird");
        else if((N>1)&&(N<6))
            System.out.println("Not Weird");
        else if(N<21)
            System.out.println("Weird");
        else
            System.out.println("Not Weird");

        scanner.close();
    }
}