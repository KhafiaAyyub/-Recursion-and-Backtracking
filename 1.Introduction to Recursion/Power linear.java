/* Power-linear
Easy  

1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function .

Input Format
A number x
A number n

Output Format
x raised to the power n

Constraints
1 <= x <= 10
0 <= n <= 9

Sample Input
2
5

Sample Output
32

*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x,n));
        
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xpnm1  = power(x,n-1);
        int xpn = xpnm1 * x;
        return xpn;
    }

}
