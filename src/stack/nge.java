package stack;

import java.util.Stack;

public class nge {
	
	public static void printNGE(long[] arr, int n) { 
        // Your code here
        Stack<Integer> gt = new Stack<Integer>();
        Stack<Long> ans = new Stack<Long>();
        
        
        for(int j = n-1 ; j>=0 ;j--){
            long i = arr[j];
           // System.out.println(" i "+ i);
//            if(gt.size() == 0){
//                gt.push(j);
//                ans.push(Long.valueOf(-1));
//                //System.out.println(" gt peel "+ gt.peek());
//            }else{
            	//System.out.println( " retar. "+ arr[gt.peek()]);
//                if(arr[gt.peek()] > i){
//                	ans.push(arr[gt.peek()]);
//                    gt.push(j);
//                    
//                    
//                }else{
                    while(gt.size()>0 && arr[gt.peek()]  <i){
                        gt.pop();
                    }
                    if(gt.size()==0){
                        gt.push(j);
                        ans.push(Long.valueOf(-1));
                    }else {
                    	ans.push(arr[gt.peek()]);
                    	gt.push(j);
                    }
               // }
           // }
            
        }
        //System.out.println(" ans ");
        while(!ans.isEmpty()){
        	
            System.out.print(ans.pop() + " ");
            
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNGE(new long[] {1 , 2,1}, 3);
	}

}
