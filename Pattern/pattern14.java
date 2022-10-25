//https://practice.geeksforgeeks.org/problems/square-pattern-1662287714/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_21

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
                obj.printSquare(n);
            }
        }
    }
    // } Driver Code Ends
    
    
    class Solution {
    
        void printSquare(int n) {
            // code here
            for(int i= 0 ; i < n ;i++){
                if(i==0){
                    System.out.println("*".repeat(n));
                    continue;
            }
                if(i==n-1){
                    System.out.println("*".repeat(n));
                    break;
                }
                System.out.print("*");
                System.out.print(" ".repeat(n-2));
                System.out.print("*");
                System.out.println();
            }
        }
    }
