
public class TempClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = -5;
		int num = 3;
		
		target =- num;  // Noncompliant; target = -3. Is that really what's meant?
		target =+ num; // Noncompliant; target = 3
		
		target = -5;
		num = 3;
		target = -num;
		
		System.out.println(target);
	}

}
