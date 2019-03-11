import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DummyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		String s = "abba";
		char[] sarr = s.toCharArray();
		
		for(int i=0; i<s.length(); i++){
			for(int j=i; j<s.length(); j++){
				String sub="";
				for(int k=i; k<=j;k++){
					sub = sub.concat(String.valueOf(sarr[k]));
				}
				System.out.println(sub);
				if(hm.containsKey(sub)){
					int val = hm.get(sub);
					hm.put(sub, val+1);
				}else{
					hm.put(sub, 1);
				}
				
			}
		}
		
		@SuppressWarnings("unused")
		Set<String> keyset = hm.keySet();
		
		
	}

}
