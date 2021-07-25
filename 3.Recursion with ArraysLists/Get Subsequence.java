/* Get Subsequence
Easy 

1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.

Input Format
A string str

Output Format
Contents of the arraylist containing subsequences as shown in sample output

Constraints
0 <= str.length <= 20

Sample Input
abc

Sample Output
[, c, b, bc, a, ac, ab, abc]

*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return  bres;
        }
        char ch = str.charAt(0); //a
        String ros = str.substring(1);//bc
        ArrayList<String> rres = gss(ros);//[--,-c,b--,bc]

        ArrayList<String> mres = new ArrayList<>();
        for(String rstr:rres){
            mres.add(""+ rstr);
           
        }
        for(String rstr:rres){
          
            mres.add(ch + rstr);
        }
        return mres;
    }

}
