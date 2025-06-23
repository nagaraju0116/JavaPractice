package JaVa;

class Student  extends Object
{
	int rollno;
	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
}
public class ArrayStudents {

	public static void main(String[] args) {
		//Student s = new Student(23,"robin");  --one 
	
		//multiple
		
		Student students[] = new Student[3];
		students[0]= new Student(1,"robin");
		students[1]= new Student(2,"stalin");
		students[2]= new Student(3,"john");
		/*
		 * s.toString(); 
		 * toString() method from object class
		 */
	//	System.out.println(s);  --one
		//System.out.println(s.toString());  --output (JaVa.Student@6f539caf)
	
	
		//multiple
		
		for(Student s : students) {
			System.out.println(s); 
		}
	}

}
