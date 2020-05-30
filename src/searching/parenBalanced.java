package searching;

public class parenBalanced {
	public static boolean checkValidString(String s) {
        int left = 0, right=0, both =0;
        
        for(char c: s.toCharArray()){
            if(c=='('){
                left++;
            }else if(c==')'){
                right++;
                if(left+both < right){
                    return false;
                }
                
                right--;
                
                if(left>0){
                    left--;
                    
                }else{
                    both--;
                }
                
            }else{
                both++;
            }
            
        }
        
        if(left > 0 && left >both ){
            return false;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" is balanced "+ checkValidString("*(*("));

	}

}
