//https://practice.geeksforgeeks.org/problems/triangle-pattern-1661492263/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_7


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
            for(int i=1; i<n*2 ; i++){
                if(i%2==1){
                    for(int j= ((n*2)-i)/2;j>0;j--){
                        System.out.print(" ");
                    }
                    for(int k=0;k<i;k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }