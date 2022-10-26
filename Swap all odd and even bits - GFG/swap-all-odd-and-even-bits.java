//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to swap odd and even bits.
    public static int swapBits(int n) 
    {
	    // Your code
	    int om=0x55555555;
    // odd mask
    int em=0xAAAAAAAA;
    // even mask
    int n2=n;
    int evenmask=n&em;
    evenmask=evenmask>>1;
    int oddmask=n2&om;
    oddmask=oddmask<<1;
    int ans=evenmask|oddmask;
   return ans;
	}
    
}

//{ Driver Code Starts.

class BitWise{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//taking n
		    
		    Solution obj = new Solution();
		    
		    //calling swapBits() method of class
		    //Swap
		    System.out.println(obj.swapBits(n));
		}
	}
}
// } Driver Code Ends