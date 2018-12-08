import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListInAList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        Scanner scanner = new Scanner(System.in);
        int inputlines = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<inputlines; i++) {
        	ArrayList<Integer> lst = new ArrayList<Integer>();
        	String[] line = scanner.nextLine().split(" ");
        	
        	for(String s : line)
        	lst.add(Integer.parseInt(s));
        	
        	list.add(lst);
        }
        
        int queries = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<queries; i++) {
        	String[] query = scanner.nextLine().split(" ");
        	
        	ArrayList<Integer> result = list.get(Integer.parseInt(query[0])-1);
        	if(Integer.parseInt(query[1]) >= result.size()) {
        		System.out.println("ERROR!");
        	}else {
        		System.out.println(result.get(Integer.parseInt(query[1])));
        	}
        }
    }
}