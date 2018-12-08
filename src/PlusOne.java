import java.util.Arrays;

public class PlusOne {
	
	public static void main(String[] args) {
		int[] digits = {9};
		int[] results  = plusOne(digits);
		System.out.println(Arrays.toString(results));
	}
	
	public static int[] plusOne(int[] digits) {
        int length=digits.length;
        int[] results=addRecursive(digits,length-1);
        
        return results;
        
    }
    
    public static int[] addRecursive(int[] digits, int i){
    	if(i>=0){
            int result = digits[i] + 1;
            if(result >= 10){
                digits[i] = result % 10;
                digits = addRecursive(digits, i-1);
            }else {
                digits[i] = result;
            }
            return digits;
        }else{
        	int[] digits2 = new int[digits.length+1];
        	digits2[0]=1;
           for(int j=1; j< digits.length+1; j++) {
        	   digits2[j]= digits[j-1];
           }
           
           return digits2;
        }
        
    }

}
