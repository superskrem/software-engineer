/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 121237
 */
public class CourseView  {
    public void print(Course model){
    
    System.out.println("CourseID,CourseName,CourseDescription");
    System.out.println(model.getCourseID() + "," + model.getCourseName() + "," + model.getCourseDescription());
    
}
}
