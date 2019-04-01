/*
 * There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings.

For example, given input  and , we find  instances of ',  of '' and  of ''. For each query, we add an element to our return array, .

Function Description

Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in strings.

matchingStrings has the following parameters:

strings - an array of strings to search
queries - an array of query strings
Input Format

The first line contains and integer , the size of . 
Each of the next  lines contains a string . 
The next line contains , the size of . 
Each of the next  lines contains a string .

Constraints

 
 
 .

Output Format

Return an integer array of the results of all queries in order.

Sample Input 1

CopyDownload
Array: strings
aba
baba
aba
xzxb

Array: queries
aba
xzxb
ab

 
4
aba
baba
aba
xzxb
3
aba
xzxb
ab
Sample Output 1

2
1
0
 */

package sparse_arrays;

public class sparse_arrays {
    // Complete the matchingStrings function below.
    public  int[] matchingStrings(String[] strings, String[] queries) {
        int i,j;
            int a[]=new int[queries.length];


    for(i=0;i<queries.length;i++)
    {
        for(j=0;j<strings.length;j++)
        {
            if((queries[i].compareTo(strings[j]))==0)
        {   
                a[i]++;
        }
        }
    }
        return a;   
}
}