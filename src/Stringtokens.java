
public class Stringtokens {
	
	public static void main(String[] args){
		String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
		
		if(s.matches("[A-Za-z !,?._'@]+") && !"".equals(s)){
				s = s.trim();
	           	String[] tokens = s.split("[ .,?!']+");
	            System.out.println(tokens.length);
	            for(String token: tokens){
	                //if(!"".equals(cleaner(token))){
	                    System.out.println(cleaner(token));
	                //}
	            } 
	        }else{
	            System.out.println(0);
	        }
	}
	
	public static String cleaner(String token){
        return token.replaceAll("[^a-zA-Z]","");
    }

}
