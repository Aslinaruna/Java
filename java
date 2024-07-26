Alex finds himself in a peculiar situation at a magical event. Standing in a line of mysterious people, he wonders about his position. Can you unravel the magic and help Alex discover the number of enchanting places he might occupy in the lineup?

Input Format

The input consists of three integers.

The total number of people in the magical lineup 'n'. The minimum number of people in front of Alex 'a'. The maximum number of people behind Alex 'b'. (0 ≤ a, b < n ≤ 100)

Constraints

Null

Output Format

A mystical number representing the potential magical positions for Alex.

Sample Input 0

3
1
1
Sample Output 0

1
Sample Input 1

7
2
3
Sample Output 1

2
Sample Input 2

10
1
4
Sample Output 2

5
Sample Input 3

5
1
2
Sample Output 3

2
Contest ends in 3 days
Submissions: 12
Max Score: 10
Difficulty: Easy
Rate This Challenge:

    
More
 
1
1
import java.io.*;
2
import java.util.*;
3
​
4
public class Solution {
5
​
6
    public static void main(String[] args) {
7
        Scanner sc=new Scanner(System.in);
8
        int n1=sc.nextInt();
9
        int n2=sc.nextInt();
10
        int n3=sc.nextInt();
11
        int r1,r2;
12
        r1=n1-n2;
13
        r2=r1-n3;
14
        System.out.print(r2);
15
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
16
    }
17
}
