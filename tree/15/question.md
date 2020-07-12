Check for Balanced Tree 
Given a binary tree, find if it is height balanced or not. 
A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree. 

A height balanced tree
        1
     /     \
   10      39
  /
5

An unbalanced tree
        1
     /    
   10   
  /
5

Input:
First line of input contains the number of test cases T. For each test case, there will be only a single line of input which is a string representing the tree as described below: 

The values in the string are in the order of level order traversal of the tree where, numbers denotes node values, and a character “N” denotes NULL child.

For example:

For the above tree, the string will be: 1 2 3 N N 4 6 N 5 N N 7 N

Output:
For each testcase, in a new line, print 0 or 1 accordingly.

Your Task:
You don't need to take input. Just complete the function isBalanced() that takes root node as parameter and returns true, if the tree is balanced else returns false.

Constraints:
1 <= T <= 100
1 <= Number of nodes <= 105
0 <= Data of a node <= 106

Expected time complexity: O(N)
Expected auxiliary space: O(h) , where h = height of tree

Example:
Input:
3
1 2 N N 3
10 20 30 40 60 N N
4 6 6
Output:
0
1
1
Explanation:
Testcase1: The tree is
        1
     /    
   2
      \
       3 
The max difference in height of left subtree and right subtree is 2, which is greater than 1. Hence unbalanced.
Testcase2: The tree is
                           10
                        /        \
                     20         30
                  /       \
               40       60
The max difference in height of left subtree and right subtree is 1. Hence balanced.
Testcase 3: The tree is 
                                      10
                        /        \
                      6          6
The maximum difference in height of left subtree and right subtree is 0. Hence balanced.

Note: The Input/Ouput format and Example given are used for system's internal purpose, and should be used by a user for Expected Output only. As it is a function problem, hence a user should not read any input from stdin/console. The task is to complete the function specified, and not to write the full code.