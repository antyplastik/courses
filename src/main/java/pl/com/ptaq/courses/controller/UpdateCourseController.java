package pl.com.ptaq.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.service.UpdateCourseService;

@RestController
public class UpdateCourseController {

    @Autowired
    UpdateCourseService updateCourseService;

    @PostMapping(value = "/update")
    @ResponseStatus(HttpStatus.OK)
    public boolean updateCourse(@RequestBody Course course){
        return updateCourseService.update(course);
    }

}
