import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class FrequencyQueries {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Iterator itr = queries.listIterator();
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
        List<Integer> retList = new ArrayList<Integer>();
        while(itr.hasNext()){
            ArrayList<Integer> query = (ArrayList<Integer>) itr.next();
            if(query.get(0) == 1) {
            	if(freq.containsKey(query.get(1))) {
            		int c =freq.get(query.get(1));
            		freq.put(query.get(1), c+1);
            	}else {
            		freq.put(query.get(1), 1);
            	}
            }else if(query.get(0) == 2) {
            	if(freq.containsKey(query.get(1))) {
            		if(freq.get(query.get(1))<=1) {
            			freq.remove(query.get(1));
            		}else {
            			int c =freq.get(query.get(1));
            			freq.put(query.get(1), c-1);
            		}
            	}
            }else {
            	if(freq.containsValue(query.get(1))) {
            		retList.add(1);
            	}else {
            		retList.add(0);
            	}
            }
        }
        return retList;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        //bufferedWriter.write(
//            ans.stream()
//                .map(Object::toString)
//                .collect(joining("\n"))
//            + "\n"
//        );

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
