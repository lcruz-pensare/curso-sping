package com.pensareluis.Holamundo.converter;

import com.pensareluis.Holamundo.entity.Course;
import com.pensareluis.Holamundo.model.CourseModel;
import org.springframework.stereotype.Component;

@Component("courseComponent")
public class CourseConverter {
    //Entity to model
    public CourseModel entity2model(Course course){
        CourseModel courseModel= new CourseModel();
        courseModel.setDescription(course.getDescrption());
        courseModel.setHours(course.getHours());
        courseModel.setPrice(course.getPrice());
        return courseModel;
    }


    //Model to entity

    public Course model2entity (CourseModel courseModel){
        Course course= new Course();
        course.setDescrption(courseModel.getDescription());
        course.setHours(courseModel.getHours());
        course.setName(courseModel.getName());
        course.setPrice(courseModel.getPrice());
        return course;

    }
}
