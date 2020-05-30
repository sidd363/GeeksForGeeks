package bt;

public class maxPossibleNumber {
	
	// function to find maximum integer possible by
    // doing at-most K swap operations on its digits
	static String max = "";
    public static void findMaximumNum(char ar[], int k) {
        // add your code here
    	bfsutil(ar, k );
    	System.out.println(" max "+ max);
    	
    }
    private static void swap (int i, int j , char [] ar) {
    	char tmp = ar[i];
    	ar[i] = ar[j];
    	ar[j]= tmp;
    }
	private static void bfsutil(char[] ar, int k) {
		// TODO Auto-generated method stub
		if(k<=0) {
			return;
		}
		int n = ar.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=i+1; j<n; j++) {
			    if(ar[i]< ar[j]) {
			    	//swap and then backtrack
			    	swap(i,j, ar);
			    	//check if number is greater than max
			    	if(max.compareTo(new String(ar)) <0 ){
			    	    max = new String(ar);
			    	}
			    	bfsutil(ar, k-1);
			    	swap(j,i,ar);
			    	
			    }
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findMaximumNum("1234567".toCharArray(), 1);
	}

}
