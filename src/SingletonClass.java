
public class SingletonClass {
	
	private static SingletonClass instance;
	public String s;
	
	private SingletonClass(){
		s="I am a singleton class!";
	}
	
	public static SingletonClass getInstance(){
		if(instance!=null){
			return instance;
		}else{
			return new SingletonClass();
		}
	}
	
}
