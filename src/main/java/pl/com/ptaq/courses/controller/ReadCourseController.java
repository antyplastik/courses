package pl.com.ptaq.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.service.ReadCourseService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ReadCourseController {

    private final ReadCourseService courseService;

    @Autowired
    public ReadCourseController(ReadCourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/id")
    @ResponseStatus(HttpStatus.FOUND)
    public Course findByIdNumber(@Valid @RequestParam(name = "id") String id) {
        return courseService.findByCourseId(id);
    }

    @PostMapping("/type")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Course> findByType( @RequestParam(name = "type") String type) {
        return courseService.findByCourseType(type);
    }

    @PostMapping(value = "/profile")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Course> findByProfile(@RequestParam(name = "profile") String profile) {
        return courseService.findByCourseProfile(profile);
    }

    @PostMapping("/localization")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Course> findByLocalization(@RequestParam(name = "localization") String localization) {
        return courseService.findByCourseLocalization(localization);
    }

    @PostMapping("/started")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Course> findAllStarted(@RequestParam(name = "started") String started) {
        started = started.toUpperCase();

        if (started.equals("Y") || started.equals("YES") || started.equals("T") || started.equals("TRUE"))
            return courseService.findCoursesStarted();
        else
            return courseService.findCoursesNotStarted();
    }
}
