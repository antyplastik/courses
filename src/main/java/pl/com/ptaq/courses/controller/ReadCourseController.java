package pl.com.ptaq.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.service.ReadCourseService;

import java.util.List;

@RestController
public class ReadCourseController {

    @Autowired
    private ReadCourseService courseService;

    @PostMapping("/type")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Course> findByType(@RequestParam(name = "type") String type) {
        courseService.findByCourseType(type);
        return null;
    }

    @PostMapping("/profile")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Course> findByProfile(@RequestParam(name = "profile") String profile) {
        return null;
    }

    @PostMapping("/localization")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Course> findByLocalization(@RequestParam(name = "localization") String localization) {
        return null;
    }

    @PostMapping("/notStarted")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Course> findAllNotStarted(@RequestParam(name = "notStarted") String started) {
        return null;
    }

    @PostMapping("/started")
    @ResponseStatus(HttpStatus.FOUND)
    public List<Course> findAllStarted(@RequestParam(name = "started") String started) {
        return null;
    }
}
