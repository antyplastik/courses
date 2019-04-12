package pl.com.ptaq.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.com.ptaq.courses.domain.model.Course;

import javax.persistence.PostUpdate;
import java.util.List;

@RestController
public class UpdateCourseController {

    @Autowired
    UpdateCourseController updateCourseController;

    @PostMapping(value = "/update")
    public List<Course> updateCourse(@RequestBody String courseId){

        return null;
    }

}
