import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int acount=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                acount++;
            }
        }
        
        long finalcount = (n/s.length())*acount;
        int rem = (int) (n%(s.length()));
        
        int remcount =0;
        for(int j=0; j<rem; j++){
            if(s.charAt(j)=='a'){
                remcount++;
            }
        }
        return finalcount+remcount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        
        System.out.println(result);

        scanner.close();
    }
}
