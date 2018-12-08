import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FraudulentNotifications {

    // Complete the activityNotifications function below.
	static int activityNotifications(int[] expenditure, int d) {
        int alerts=0;
        
        for(int i=d,k=0; i<expenditure.length; i++,k++){
            int[] medianArr = Arrays.copyOfRange(expenditure, k, i);
            float median = findMedian(medianArr);
            if(expenditure[i]>=(2*median)){
                alerts++;
            }
        }
        return alerts;

    }
    
    static float findMedian(int[] medianArr){
        //Arrays.sort(medianArr);
        medianArr = countingSort(medianArr);
        int length = medianArr.length;
        if(length % 2 == 0){
            return (float)(medianArr[(length)/2]+ medianArr[(length/2)-1])/2;
        }else{
            return (float)medianArr[(length)/2];
        }
    }
    
    static int[] countingSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        
        int[] count = new int[200000];
        for(int i=0; i<200000; ++i){
            count[i]=0;
        }
        
        for(int i=0;i<n; ++i){
            ++count[arr[i]];
        }
        
        for(int i=1; i<200000; ++i){
            count[i]+=count[i-1];
        }
        
        for(int i=0; i<n; i++){
            output[count[arr[i]]-1]= arr[i];
            --count[arr[i]];
        }
        
        for(int i=0;i<n;i++){
            arr[i]= output[i];
        }
        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        System.out.println(result);

        scanner.close();
    }
}
