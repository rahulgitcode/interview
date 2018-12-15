import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAnagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        Map<String, Integer> substr = new HashMap<String, Integer>();

        for(int i=0; i<s.length();i++){
        	for(int j=i+1; j<=s.length(); j++) {
        		String sub= s.substring(i, j);
        		char[] subArr = sub.toCharArray();
        		Arrays.sort(subArr);
        		sub = String.valueOf(subArr);
        		
        		System.out.println(sub);
        		if(substr.containsKey(sub)) {
        			int freq=substr.get(sub);
        			substr.put(sub, freq+1);
        		}else {
        			substr.put(sub, 1);
        		}
        		
        	}
        }
        
        int count =0;
        for(String key : substr.keySet()) {
        	if(substr.get(key)>1 && substr.get(key)!=2) {
        		count = count + substr.get(key);
        	}else if(substr.get(key)==2) {
        		count = count + 1;
        	}
        }
        
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            System.out.println(result);
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
