package pl.com.ptaq.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.service.DeleteCourseService;

@RestController
public class DeleteCourseController {

    @Autowired
    DeleteCourseService deleteCourseService;

    @DeleteMapping(value = "/delete")
    @ResponseStatus(HttpStatus.OK)
    public void deleteCourse(@RequestBody Course course){
        deleteCourseService.deleteCourseFromDatabase(course);
    }
}
