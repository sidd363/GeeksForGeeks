package bt;
import java.util.*;
public class combinationsum {
	public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int sum){
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		Collections.sort(a);
		
		util( new ArrayList<Integer> (),ans , sum, 0, a, 0);
		
	    return ans;
	        // add your code here
	}
	private static void util(ArrayList<Integer> tmp, ArrayList<ArrayList<Integer>> ans, int sum, int start, ArrayList<Integer> a, int csum) {
		// TODO Auto-generated method stub
		if(csum == sum) {
			if(!ans.contains(tmp)) {
			   ans.add(new ArrayList<>(tmp));
			}
			return;
		}
		if(csum >sum) {
			return;
		}
		for(int i = start; i<a.size(); i++) {
			
			int ele = a.get(i);
			tmp.add(ele);
			csum += ele;
			util( tmp,ans , sum, i, a, csum);

			csum -= ele;
			tmp.remove(tmp.size()-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a []= {8, 1, 8, 6, 8
};
		int ele = 12;
		System.out.println(combinationSum(new ArrayList<Integer>(Arrays.asList(a)), ele));

	}

}
