import java.io.*;
import java.util.*;

public class SubArraySum {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = scanner.nextInt();
        }
        
        int count =0;
        for(int i=len; i>=0; i--){ // length
            for(int j=0; j<=len-i; j++){ //start index
                int sum =0;
                for(int k=j; k<j+i; k++){ 
                    sum+=arr[k];
                }
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}