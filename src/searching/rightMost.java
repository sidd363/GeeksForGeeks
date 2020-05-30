package searching;

public class rightMost {
	static int [] arr = {0, 0 ,0, 0, 0, 0, 0, 0}; 
	
    public static int countOnes(int n){
        
        // Your code here
        // idea is to find rightmost occurrence of 1 in array using binary search
        
        return rightmost(0 , n-1)+1;
        
    }
    
    public static int rightmost(int l, int h){
        
        // Your code here
        // idea is to find rightmost occurrence of 1 in array using binary search
        if(l>=h){
            return -1;
        }
        int mid = l+(h-l)/2;
        if(arr[mid] == 1 && (mid==arr.length-1 || arr[mid+1]==0)){
            return mid;
        }
        if(arr[mid]<1){
            return rightmost(l, mid-1);
        }else{
            return rightmost(mid+1, h); 
        }
        
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" right most "+ countOnes(arr.length));
	}

}
