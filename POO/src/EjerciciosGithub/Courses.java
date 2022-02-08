package EjerciciosGithub;

import java.util.ArrayList;

public class Courses {
	
	String courseName ;
	String professorName ;
	int year;
	ArrayList<Student> listStudents = new ArrayList<Student>();
	
	public void enroll(Student student){
	      listStudents.add(student));
	}
	
	public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
	}
	
	public int countStudents(){
	       //TODO implement
	       return 0;
	}
	   
	public int bestGrade(){
	       //TODO implement
	       return 0;
	 }
	
	public static void main(String[] args) {
		
		Courses collection = new Courses();
		Student student1 = new Student("Carlos","Fregoso",183100,70,7);
		
	}
}
