/* Print Stair Paths
Easy  

1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.

Input Format
A number n

Output Format
Print paths (one path in each line) in order hinted by Sample output

Constraints
0 <= n <= 10

Sample Input
3

Sample Output
111
12
21
3

*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printStairPaths(n,"");
    }

    public static void printStairPaths(int n, String path) {
        if(n<0){
            return;
        }
        
        if(n == 0){
            System.out.println(path);
            return;
        }
        
        
        printStairPaths(n-1,path + "1");
        printStairPaths(n-2,path + "2");
        printStairPaths(n-3,path + "3");
    }

}

