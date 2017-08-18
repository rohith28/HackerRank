## Problem
Lily has a chocolate bar consisting of a row of  squares where each square has an integer written on it. She wants to share it with Ron for his birthday, which falls on month m and day d. Lily wants to give Ron a piece of chocolate only if it contains  consecutive squares whose integers sum to .

Given m,d , and the sequence of integers written on each square of Lily's chocolate bar, how many different ways can Lily break off a piece of chocolate to give to Ron?

For example, if d=3,m=2  and the chocolate bar contains  rows of squares with the integers[1,2,1,3,2] written on them from left to right, the following diagram, shows two ways to break off a piece:,

## Input Format

The first line contains an integer denoting  n(the number of squares in the chocolate bar). 
The second line contains  space-separated integers describing the respective values of  s0,s1,s2....sn-1(the numbers written on each consecutive square of chocolate). 
The third line contains two space-separated integers describing the respective values of  d(Ron's birth day) and m(Ron's birth month).

## Output Format

Print an integer denoting the total number of ways that Lily can give a piece of chocolate to Ron.

## Sample Input 0

5
1 2 1 3 2 
3 2
## Sample Output 0

2