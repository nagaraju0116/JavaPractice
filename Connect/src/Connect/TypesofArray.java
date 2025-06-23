package Connect;

public class TypesofArray {
//typees define as int and string values of arrays
	public static void main(String[] args) {
		
		Student s1= new Student();
		s1.rollno=1;
		s1.name="dani";
		s1.marks= 80;

		Student s2= new Student();
		s2.rollno=4;
		s2.name="sam";
		s2.marks= 70;
		
		Student s3= new Student();
		s3.rollno=3;
		s3.name="lee";
		s3.marks= 89;
		
		//System.out.println(s1.rollno+":"+s1.name+":"+s1.marks);
		
		//this is for array of students refernces  not an 3 student obj
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		//students.length  is to get array of students all
		/*
		 * for(int i=0;i<students.length;i++) {
		 * System.out.println(students[i].rollno+")"+students[i].name+" : "+students[i].
		 * marks); }
		 */
		 
		//for each loop / enhanced for loop
		for(Student stud : students) {
			System.out.println(stud.name+" : "+stud.marks);
		}
	}

}

class Student{
	
	int rollno;
	String name;
	int marks;
}


