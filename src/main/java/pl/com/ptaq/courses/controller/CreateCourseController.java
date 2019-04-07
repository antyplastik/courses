package pl.com.ptaq.courses.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.service.CreateCourseService;

@RestController()
public class CreateCourseController {

    CreateCourseService createCourseService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addCourse(@RequestBody Course course) {
        return createCourseService.addCourse(course);
    }

}
