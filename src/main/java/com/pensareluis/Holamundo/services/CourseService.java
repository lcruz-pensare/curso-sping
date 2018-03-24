package com.pensareluis.Holamundo.services;

import com.pensareluis.Holamundo.entity.Course;

import java.util.List;

/**
 * @author Jorge Álvarez
 * @version 1.0 - 2018/03/23
 */
public interface CourseService {
    public List<Course> listAllcourses();
    public Course addCourse(Course course);
    public int removeCourse(Course id);
    public Course uddapteCourse(Course course);

}