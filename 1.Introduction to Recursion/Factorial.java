/* Factorial
Easy  

1. You are given a number n.
2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.

Input Format
A number n

Output Format
factorial of n

Constraints
0 <= n <= 10

Sample Input
5

Sample Output
120

*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        
        int nm1f = factorial(n-1);
        int nf = nm1f * n;
        return nf;
    }

}
