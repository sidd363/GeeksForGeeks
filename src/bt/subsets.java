package bt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class subsets {
	
	public static void printAllSubsets(int a[]){
        // your code here
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(a);
		util( new ArrayList<Integer> (), ans, 0, a);
		//()(1)(1 2)(1 2 2)(2)(2 2)
		System.out.println(" ans"+ ans);
//		for(int i = 0;i<ans.size();i++) {
//			System.out.print("(");
//			for(int j = 0;j<ans.get(i).size();j++) {
//				System.out.print(ans.get(i).get(j));
//				if(j!=ans.get(i).size()-1) {
//					System.out.print(" ");
//				}
//			}
//			System.out.print(")");
//		}
    }
	private static void util(ArrayList<Integer> tmp, ArrayList<ArrayList<Integer>> ans, int start, int[] a) {
		// TODO Auto-generated method stub
		
//		if(tmp.size()>a.length) {
//			return;
//		}
//		
		if(tmp.size()>0) {
		
		   ans.add(new ArrayList<>(tmp));
		}
		for(int i = start;i<a.length;i++) {
			if(i> start && a[i] ==  a[i-1])continue;
			tmp.add(a[i]);
			util( tmp, ans, i+1, a);
			tmp.remove(tmp.size()-1);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {8,1,6,8,8};
		printAllSubsets(a);
	}

}
