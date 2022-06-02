// { Driver Code Starts
import java.util.*;

class Node
{
    int data;
    Node left, right;
    
    Node(int item)
    {
        data = item;
        left = right = null;
    }    
        public void setLeft(Node left) 
    {
        this.left = left;
    }
  
    public void setRight(Node right) 
    {
        this.right = right;
    }
        
    
}


class ConstructBT
{
    Node root;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    
	    while(t-- > 0)
	    {
	        int n = sc.nextInt();
	        
	        int inord[] = new int[n];
	        int level[] = new int[n];
	        for(int i = 0; i < n; i++)
	            inord[i] = sc.nextInt();
	            
	        for(int i = 0; i < n; i++)
	             level[i] = sc.nextInt();
	             
	        GfG g = new GfG();
	        Node node =  g.buildTree(inord, level);
	        printPreOrder(node);
	        System.out.println();
	        
	        
	    }
    }
    
   static void printPreOrder(Node node)
   {
       if(node == null)
          return;
          
        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
   }
}
// } Driver Code Ends


/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG
{
    public  Node search(int[] inorder,int ii,int ie,int[] levelorder){
   
   if(ii>ie) return null;
   Node root=new Node(levelorder[0]);
   int idx=ii;
   while(inorder[idx]!=root.data) idx++;

   HashSet<Integer> set=new HashSet<>();
   for(int i=ii;i<idx;i++){
       set.add(inorder[i]);
   }
   
   int[] lvls=new int[idx-ii];/*left levelorder array */
   int[] lvrs=new int[ie-idx];/*right levelorder array*/
   int ls=0,rs=0;
   for(int j =1;j<levelorder.length;j++){
       int x=levelorder[j];
       if(set.size()!=0 && set.contains(x)){
           lvls[ls++]=x;
           set.remove(x);
       }else{
           lvrs[rs++]=x;
       }
   }
   
   
   root.left=search(inorder,ii,idx-1,lvls);
   root.right=search(inorder,idx+1,ie,lvrs);
   return root;
   
  }

    Node buildTree(int inord[], int level[])
    {
       Node x= search(inord,0,inord.length-1,level);
       return x;
    }
    
   
}


