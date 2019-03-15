
public class Solution {
	
	public static void main(String[] args) {
		int num = 10896;
		int count = 0;
        String input = String.valueOf(num);

        for(int i=0; i< input.length(); i++){
            int n = Integer.valueOf(input.charAt(i));
            switch(n){
                case 0: count+=1;break;
                case 6: count+=1;break;
                case 8: count+=2;break;
                case 9: count+=1;break;
                default: break;
            }
        }
        
        System.out.println(count);
	}

}
