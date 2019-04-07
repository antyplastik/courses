package pl.com.ptaq.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.service.CreateCourseService;

@RestController()
public class CreateCourseController {

    CreateCourseService createCourseService;

    @PostMapping("/add")
    public boolean addCourse(@RequestBody Course course) {


        return false;
    }

}
