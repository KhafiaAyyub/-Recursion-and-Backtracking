/* Flood Fill

Easy 
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a. The numbers can be 1 or 0 only.
4. You are standing in the top-left corner and have to reach the bottom-right corner. 
Only four moves are allowed 't' (1-step up), 'l' (1-step left), 'd' (1-step down) 'r' (1-step right). You can only move to cells which have 0 value in them. 
You can't move out of the boundaries or in the cells which have value 1 in them (1 means obstacle)
5. Complete the body of floodfill function -to print all paths that can be used to move from top-left to bottom-right.

Note-> If all four moves are available make moves in the order 't', 'l', 'd' and 'r'

Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements

Output Format
trrrdlt
tlldrt
.. and so on

Constraints
1 <= n <= 10
1 <= m <= 10
e1, e2, .. n * m elements belongs to set (0, 1)

Sample Input
3 3
0 0 0
1 0 1
0 0 0

Sample Output
rddr

*/
