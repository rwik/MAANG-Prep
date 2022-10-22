https://practice.geeksforgeeks.org/problems/triangle-number-1661428795/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_4

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
           String [] strArray = new String [n];
                for (int i=0; i<n;i++){
                   strArray[i]=(i+1+" ").repeat(i+1); 
                }
                for(int i = 0 ; i<n;i++){
                    System.out.println(strArray[i]);
                } 
        }
    }
