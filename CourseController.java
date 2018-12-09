

public class CourseController {
	private final Course model;
	private final CourseView view;

	public CourseController(Course model, CourseView view) {
		this.model = model;
		this.view = view;
	}
	
	public void updateView() {
		view.print(model);
	}
	
	public void setCourseID(String ID) {
		model.setCourseID(ID);
	}
	public void setCourseName(String courseName) {
		model.setCourseName(courseName);
	}
        public void setCourseDescription(String courseDesc) {
		model.setCourseDescription(courseDesc);
	}
}
	


