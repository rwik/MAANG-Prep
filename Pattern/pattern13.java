//https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718712/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_13

//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class Main {
        // Driver code
        public static void main(String[] args) throws Exception {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim());
            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine().trim());
                Solution obj = new Solution();
                obj.printTriangle(n);
            }
        }
    }
    // } Driver Code Ends
    
    
    // Back-end complete function Template for Java
    
    class Solution {
    
        void printTriangle(int n) {
            int counter =1;
            for(int i = 0 ; i < n ; i++){
                for(int j=0;j<i+1;j++){
                    System.out.print(counter+" ");
                    counter += 1;
                }
                System.out.println();
            }
        }
    }