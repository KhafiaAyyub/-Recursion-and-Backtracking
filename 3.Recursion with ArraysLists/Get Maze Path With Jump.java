/* Get Maze Path With Jumps
Easy  

1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 

Input Format
A number n
A number m

Output Format
Contents of the arraylist containing paths as shown in sample output

Constraints
0 <= n <= 10
0 <= m <= 10

Sample Input
2
2

Sample Output
[h1v1, v1h1, d1]
g
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    
    ArrayList<String> paths = getMazePaths(1,1,n,m);
    System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
            
        }
        
        ArrayList<String> paths = new ArrayList<>();
        
        //horizontal moves
        for(int ms=1;ms<=dc-sc;ms++){
            ArrayList<String> hpaths = getMazePaths(sr,sc+ms,dr,dc);
            for(String hpath:hpaths){
                paths.add("h"+ ms + hpath);
            }
        }
        
        //vertical moves
        for(int ms=1;ms<=dr-sr;ms++){
            ArrayList<String> vpaths = getMazePaths(sr+ms,sc,dr,dc);
            for(String vpath:vpaths){
                paths.add("v"+ ms+ vpath);
            }
        }
        //diagonal moves
        for(int ms=1;ms<=dc-sc && ms<=dr-sr;ms++){
            ArrayList<String> dpaths = getMazePaths(sr+ms,sc+ms,dr,dc);
            for(String dpath:dpaths){
                paths.add("d"+ ms+ dpath);
            }
        }
        return paths;
    }

}
