https://practice.geeksforgeeks.org/problems/double-triangle-pattern-1662664259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_12

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
    
    
    class Solution {
    
        void printTriangle(int n) {
            // code here
            int l = n*3+1;
            for(int i =0; i<n ; i++){
                for (int j =1;j<=i+1;j++)
                {
                    System.out.print(j+" ");
                }
                for(int m =l ; m>0 ; m-- ){
                    System.out.print(" ");
                }
                for (int k= i+1; k>0;k-- ){
                    System.out.print(k+" ");
                }
                l=l-4;
                System.out.println();
            }
        }
    }