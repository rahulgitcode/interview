import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student {
    public String name;
    public double cgpa;
    public int id;
    
    public Student(String name, double cgpa, int id){
        this.name= name;
        this.id = id;
        this.cgpa=cgpa;
    }
    public String getName(){
        return this.name;
    }
    public double getCGPA(){
        return this.cgpa;
    }
    public int getID(){
        return this.id;
    }
    
}
class StudentComparator implements Comparator<Student>{ 
    
    // Overriding compare()method of Comparator  
                // for descending order of cgpa 
    public int compare(Student s1, Student s2) { 
        if (s1.cgpa < s2.cgpa) 
            return 1; 
        else if (s1.cgpa > s2.cgpa) 
            return -1; 
        else
        	return 0;
        } 
}
class Priorities{
	
    List<Student> getStudents(List<String> events){
        PriorityQueue<Student> pqueue = new PriorityQueue<Student>(new StudentComparator());
        
        Iterator itr = events.iterator();
        while(itr.hasNext()){
            String line = (String) itr.next();
            String[] actions = line.split(" ");
            if(actions[0].equals("ENTER")) {
            	pqueue.add(new Student(actions[1], Double.parseDouble(actions[2]), 
            			Integer.parseInt(actions[3])));
            }else {
            	if(pqueue.poll()==null) {
            		break;
            	}
            	
            }
        }
        List<Student> students = new ArrayList<Student>();
        
        while(!pqueue.isEmpty()) {
        	Student st = pqueue.remove();
        	students.add(st);
        }
        
        return students;
    }
}

public class PriorityQueueExample {
	private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<String>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
        	System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
