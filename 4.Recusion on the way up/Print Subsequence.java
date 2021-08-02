/* Print Subsequence
Easy  

1. You are given a string str.
2. Complete the body of printSS function - to calculate and print all subsequences of str.

Input Format
A string str

Output Format
Subsequences of str in order hinted by Sample output

Constraints
0 <= str.length <= 7

Sample Input
yvTA

Sample Output
yvTA
yvT
yvA
yv
yTA
yT
yA
y
vTA
vT
vA
v
TA
T
A

*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        printSS(str,"");
    }

    public static void printSS(String str, String asf) {
        
        if (str.length() ==0){
            System.out.println(asf);
            return;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        //yes
        printSS(ros,asf +ch);
        //no
        printSS(ros,asf);
    }

}



