package pl.com.ptaq.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.service.CreateCourseService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController()
public class CreateCourseController {

    @Autowired
    CreateCourseService createCourseService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addCourse(@RequestBody Course course) {
        return createCourseService.addCourseToDatabase(course);
    }

    @PostMapping(value = "/addList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, Course> addCourse(@RequestBody List<Course> courses) {
        Map<String, Course> response = new HashMap<>();

        if (courses != null)
            for (Course course : courses)
                if (createCourseService.addCourseToDatabase(course))
                    response.put("Created", course);
                else
                    response.put("Not created", course);

        return response;
    }
}
