package heap;
import java.util.*;

public class mergeKSortedArr {
	static class triplet implements Comparable<triplet>{
		int val;
		int pa;// position of array in grid
		int pva;// position of value in array itself
		
		triplet(int a, int b, int c){
			val = a;
			pa = b;
			pva = c;
		}

		@Override
		public int compareTo(triplet o) {
			// TODO Auto-generated method stub
			if(val <= o.val) {
				return -1;
			}
			return 1;
		}
		
		
	}
	
	public static ArrayList<Integer> mergeKArrays(int[][] mat,int k) 
    {
        // Write your code here.
		ArrayList<Integer> ans = new ArrayList<Integer>();
		PriorityQueue<triplet> pq = new PriorityQueue<triplet>();
		
		for(int i = 0;i<k;i++) {
			pq.add(new triplet(mat[i][0], i, 0 ));
		}
		
		
		while(pq.size() > 0) {
			triplet t = pq.poll();
			ans.add(t.val);
			int index = t.pva;
			index++;
			if(index < mat[t.pa].length) {
				pq.add(new triplet(mat[t.pa][index], t.pa, index ));
			}
			
		}
		
		
		return ans;
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] mat = {{1, 2, 3, 10, 11},{4, 5, 6},{7, 8, 9}};
		System.out.println(mergeKArrays(mat, 3));
	}

}
