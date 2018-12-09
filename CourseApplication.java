

public class CourseApplication {
	public static void main(String[] args) {
		Course model = new Course();
		CourseView view = new CourseView();
		CourseController controller = new CourseController(model, view);
		controller.updateView();
		controller.setCourseID("CSE452");
		controller.updateView();
		
	}
}