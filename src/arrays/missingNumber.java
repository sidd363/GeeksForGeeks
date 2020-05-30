package arrays;

public class missingNumber {
	
	// function to find first positive missing number
    public static int missingNumber(int arr[], int size)
    {
        
        // Your code here
        // You can add utility functions (if required)
        //segregate non positives
    	int j = 0;
    	for(int i = 0;i<size;i++) {
    		if(arr[i] <=0) {
    			//swap with j and increment j
    			int tmp = arr[j];
    		    arr[j] = arr[i];
    			arr[i] = tmp;
    			j++;
    		}
    	}
    	//above function keeps positive and zero at one end
    	
    	int [] pos = new int [size-j];
    	
    	
    	int i =0;
    	for(int l = j;l<size;l++) {
    		pos[i++] = arr[l];
    	}
    	
    	
    	
    	
    	for(int k = j ;k<size;k++) {
    		int x = Math.abs(arr[k]);
    		//System.out.println(" x "+ x + " k "+ k);
    		if(x-1+j <arr.length && arr[x-1+j]>0) {
    			arr[x-1+j] = -arr[x-1+j];
    		}
    	}
    	
//    	for(int l:pos) {
//    		System.out.println(" l "+ l);
//    	}
    	for(int l = j ;l<arr.length;l++) {
    		if(arr[l]>0) {
    			return l+1-j;
    		}
    	}
        return arr.length+1-j;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {0,-10,1,3,-20};

		System.out.println(missingNumber(arr, arr.length));
	}

}
