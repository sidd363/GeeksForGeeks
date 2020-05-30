package searching;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1, 2, 5, 8, 9};
		System.out.println( bs(a, 0, a.length, 2));
	}

	private static boolean bs(int[] a, int low, int high, int key) {
		// TODO Auto-generated method stub
		System.out.println(" low "+ low + " high "+ high);
		if(low>high) {
			return false;
		}
		int mid = low+ (high-low)/2;
		//System.out.println(" mid "+ mid + " ee "+ a[mid]);
		if(a[mid]==key) {
			return true;
		}
		boolean lt = false, rt = false;
		if(a[mid]<key) {
			lt= bs(a, mid+1, high, key);
		}else {
			rt= bs(a, low, mid-1, key);
		}
		return lt||rt;
	}

}
