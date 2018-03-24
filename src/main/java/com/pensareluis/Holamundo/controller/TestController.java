package com.pensareluis.Holamundo.controller;

import com.pensareluis.Holamundo.entity.Course;
import com.pensareluis.Holamundo.impl.CourseServicesImpl;
import com.pensareluis.Holamundo.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import com.pensareluis.Holamundo.services.CourseService;


/**
 * @author Jorge Álvarez
 * @version 1.0 - 2018/03/23
 */
@Controller
@RequestMapping("/test")
public class TestController {

    CourseService courseService;


    @GetMapping("/listcourses")
    public Integer listAllCourses(){
        Integer respuesta = 21312;

        List<Course> cursos = courseService.listAllcourses();
        System.out.println( "Lista de cursos: " + Arrays.toString( cursos.toArray() ) );


        return respuesta;
    }


    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }


}
