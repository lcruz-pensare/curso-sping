package com.pensareluis.Holamundo.controller;

import com.pensareluis.Holamundo.entity.Course;
import com.pensareluis.Holamundo.services.CourseService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jorge Álvarez
 * @version 1.0 - 2018/03/23
 */
@Controller
@RequestMapping("/courses")
public class CourseController {
    private static final String COURSES_VIEW="courses";

    private static final Log LOG = LogFactory.getLog(CourseController.class);


    @Autowired
    @Qualifier("courseServiceImpl")
    private CourseService courseService;

    @GetMapping("/listcourses")
    public ModelAndView listAllCourses(){
        LOG.info("Call: "+ "listAllCourses()");
        ModelAndView mov = new ModelAndView(COURSES_VIEW);
        mov.addObject("courses",courseService.listAllcourses());
        mov.addObject("titulo","Titulo: Cursos");
        mov.addObject("course",new Course());

        return mov;
    }

    @PostMapping("/addcourse")
    public String addCourse(@ModelAttribute("course") Course course) {
        LOG.info("call: "+ "addCourse()"+"--param: " + course.toString());
        courseService.addCourse(course);
        return "redirect:/courses/listcourses";
    }
}
