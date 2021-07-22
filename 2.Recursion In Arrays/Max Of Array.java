/* Max Of An Array
Easy  

1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the maximum of input. 
4. For the purpose complete the body of maxOfArray function. Don't change the signature.

Input Format
A number n
n1
n2
.. n number of elements

Output Format
A number representing max

Constraints
1 <= n <= 10^4
0 <= n1, n2, .. n elements <= 10 ^9

Sample Input
6
15
30
40
4
11
9

Sample Output
40

*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maxOfArray(arr,0));
    }


    public static int maxOfArray(int[] arr, int idx){
        
        if(idx == arr.length-1){
            return arr[idx];
        }
        
        int misa = maxOfArray(arr, idx+1);
        if(misa > arr[idx]){
            return misa;
        }
        else{
            return arr[idx];
        }
        
        
    }

}
