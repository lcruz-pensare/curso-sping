package com.pensareluis.Holamundo.impl;

import com.pensareluis.Holamundo.entity.Course;
import com.pensareluis.Holamundo.repository.CursoRepository;
import com.pensareluis.Holamundo.services.CourseService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author Jorge Álvarez
 * @version 1.0 - 2018/03/23
 */
@Service("courseServiceImpl")
public class CourseServicesImpl implements CourseService {

    private static final Log LOG = LogFactory.getLog(CourseService.class);

    CursoRepository cursoRepository;

    @Override
    public List<Course> listAllcourses() {
        List<Course> cursos = cursoRepository.findAll();
        return cursos;
    }

    @Override
    public Course addCourse(Course course) {
        return null;
    }

    @Override
    public int removeCourse(Course id) {
        return 0;
    }

    @Override
    public Course uddapteCourse(Course course) {
        return null;
    }

    @Autowired
    public void setCursoRepository(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

}
