package searching;

public class minNumInRotated {
	
	//Given an array A  which is sorted and contains N distinct elements. Also, this array is rotated at some unknown point. The task is to find the minimum element in it. 
	public static int findMin(int[] nums) {
		int ans = 0;
		// find pivot position 
		// then we have two sorted arrays 
		// element next to pivot will be minimum
		int l = 0;
		int h = nums.length-1;
		
		int pivot= -1;
		// pivot is that element which is greater than left and smaller than right element
		while(l<=h) {
			int mid = l+(h-l)/2;
			System.out.println(" mid ele "+ mid+ " nukms"+ nums[mid]);
			if(mid-1>=0 && mid+1<=nums.length-1 && nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) {
				pivot = mid;
				System.out.println(" mid found "+ mid);
				break;
			}
			if(mid==0 ) {
				if(nums[mid]>nums[mid+1]) {
					pivot = mid;
					
					//System.out.println(" mid found2 "+ mid);
					break;
				}else {
					l = mid+1;
					continue;
				}
			}
			if(nums[mid]>nums[0]) {
				l = mid+1;
			}else {
				h = mid-1;
			}
		}
		// if not where to go then compare wth first el if its larger then search in right sub array else search in left subarray
		// element next to pivot is smallest element
		
		ans = pivot+1;
	    return nums[ans];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub 4,5,6,7, 9, 0,1,2
		System.out.println(" min num ber in  rotated sorted array "+ findMin(new int[] {4,2}));
	}

}
