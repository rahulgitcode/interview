
public class TwiceBiggerThanOther {

	public static void main(String[] args) {
		int[] nums = {66,24,8,3};
		int index = dominantIndex(nums);
		System.out.println(index);
	}
	
	public static int dominantIndex(int[] nums) {
        int greatest = -1;
        int i;
        for(i=0; i< nums.length; i++){
            boolean flag = true;
            
            for(int j=0; j< nums.length; j++){
                if(i!=j && nums[i] < 2*nums[j]){
                    flag= false;
                    break;
                }
            }
            
            if(flag){
                greatest = i;
            }
        }
        return greatest;
    }
}
