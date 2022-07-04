// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done
    static int[] parent;
    
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        parent=new int[101];
       
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
           
        }
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        int count=0;
        int profit=0;
        for(Job e:arr){
            int val=find(e.deadline);
            if(val>0){
                count++;
                profit+=e.profit;
                parent[val]=find(val-1);
            }
        }
        return new int[] {count,profit};
        
    }
    public  int find( int f) {
  if(parent[f]==f) return f;
  parent[f]=find(parent[f]);
  return parent[f];
  }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/