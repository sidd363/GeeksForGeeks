package stack;

import java.util.Arrays;
import java.util.Stack;

public class nge2 {

	public static void printNGE(int[] A) { 
		int n = A.length, res[] = new int[n];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n * 2; i++) {
            while (!stack.isEmpty() && A[stack.peek()] < A[i % n])
                res[stack.pop()] = A[i % n];
            stack.push(i % n);
        }
        
        for(int i : res) {
        	System.out.println(i);
        }
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNGE(new int[] {1 ,5, 4, 2, 3});
		//printNGE(new int[] {1 ,2, 1});
	}

}
