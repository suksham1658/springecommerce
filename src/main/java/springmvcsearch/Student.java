package springmvcsearch;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Student
{

	private Integer studentId;
	private String name;

	private Date dob;
	private List<String>course[];
	private String gender;
	
	private Address address;
	
	
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<String>[] getCourse() {
		return course;
	}
	public void setCourse(List<String>[] course) {
		this.course = course;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", dob=" + dob + ", course="
				+ Arrays.toString(course) + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
	
	
	}
	
	

