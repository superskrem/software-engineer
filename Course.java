public class Course {
	private String courseID = "CSE532";
	private String courseName = "Software Engineering";
	private String courseDescription = "Introduction to software engineering";
	
	public String getCourseID() {
		return courseID;
	}
	
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseDescription() {
		return courseDescription;
	}
	
	public void setCourseDescription(String courseDesc) {
		courseDescription = courseDesc;
	}
}