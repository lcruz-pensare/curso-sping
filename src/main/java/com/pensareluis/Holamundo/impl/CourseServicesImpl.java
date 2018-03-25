package com.pensareluis.Holamundo.impl;

import com.pensareluis.Holamundo.entity.Course;
import com.pensareluis.Holamundo.repository.CursoRepository;
import com.pensareluis.Holamundo.services.CourseService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author Jorge Álvarez
 * @version 1.0 - 2018/03/23
 */
@Service("courseServiceImpl")
public class CourseServicesImpl implements CourseService {

    private static final Log LOG = LogFactory.getLog(CourseService.class);
    @Autowired
    @Qualifier("courseJpaRepository")
    CursoRepository cursoRepository;

    @Override
    public List<Course> listAllcourses() {
        return cursoRepository.findAll();
    }

    @Override
    public Course addCourse(Course course) {
        return cursoRepository.save(course);
    }

    @Override
    public int removeCourse(Course id) {
         cursoRepository.delete(id);
         return 0;
    }

    @Override
    public Course uddapteCourse(Course course) {
        return cursoRepository.save(course);
    }
}
