/* Get Kpc
Easy  

1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map :
    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
    
Input Format
A string str

Output Format
Contents of the arraylist containing words as shown in sample output

Constraints
0 <= str.length <= 10
str contains numbers only

Sample Input
78

Sample Output
[tv, tw, tx, uv, uw, ux]

*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String>  words = getKPC(str);
        System.out.println(words);
    }
    
    static String[] codes = { ".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz" };
    
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return  bres;
        }
        //573
        char ch = str.charAt(0); //5
        String ros = str.substring(1); //73
        
        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();
        
        String codeforch = codes[ch - '0'];
        for(int i=0;i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);
            for(String rstr: rres){
                mres.add(chcode + rstr);
            }
        
        }
        return mres;
    }

}
