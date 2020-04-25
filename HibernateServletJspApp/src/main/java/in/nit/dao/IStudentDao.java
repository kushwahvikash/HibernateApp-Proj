package in.nit.dao;

import java.util.List;

import in.nit.model.Student;

public interface IStudentDao {

	/**
	 * This Method takes model class object as input
	 * and returns PrimaryKey(Integer as)Output
	 * 
	 */
	public Integer saveStudent(Student s);
	/**
	 * This method is used to fetch 
	 * all rows from DB table 
	 * as List of Objects
	 * 
	 */
	public List<Student> getAllStudents();
	/**
	 * This method is used to remove one row
	 * based on PK value. Returns success/fail
	 * message back to UI
	 */
	public String deleteStudent(Integer id);
	/***
	 * This method is used to fetch one row data
	 * based on PK value. 
	 */
	public Student getOneStudent(Integer id);
	/**
	 * This method is used to update one student
	 * object based on PK value.
	 * 
	 */
	public String updateStudent(Student s);
	
	
	
	
	
	
}
