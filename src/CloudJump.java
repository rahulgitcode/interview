import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CloudJump {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        for(int i=0; i<c.length; ){
            if((i+2)<c.length && c[i+2] == 0){
                i=i+2;
                jumps++;
            }else if((i+1)<c.length){
                i = i+1;
                jumps++;
            }else {
            	break;
            }
        }
        return jumps;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
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
