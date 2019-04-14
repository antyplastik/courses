package pl.com.ptaq.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.service.CreateCourseService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController()
public class CreateCourseController {

    @Autowired
    CreateCourseService createCourseService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Course added")
//    })
    public boolean addCourse(@Valid @RequestBody Course course) {
        return createCourseService.addCourseToDatabase(course);
    }

    @PostMapping(value = "/addList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, Boolean> addCourse(@Valid @RequestBody List<Course> courses) {
        Map<String, Boolean> response = new HashMap<>();

        if (courses != null)
            for (Course course : courses)
                if (createCourseService.addCourseToDatabase(course))
                    response.put("Created " + course.toString(), true);
                else
                    response.put("Not created" + course.toString(), false);

        return response;
    }
}
