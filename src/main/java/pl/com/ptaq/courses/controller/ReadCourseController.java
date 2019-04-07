package pl.com.ptaq.courses.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.com.ptaq.courses.domain.model.Course;

import java.util.List;

@RestController
public class ReadCourseController {

    @PostMapping("/type")
    public List<Course> findByType(@RequestParam(name = "type") String type) {
        return null;
    }

    @PostMapping("/profile")
    public List<Course> findByProfile(@RequestParam(name = "profile") String profile) {
        return null;
    }

    @PostMapping("/localization")
    public List<Course> findByLocalization(@RequestParam(name = "localization") String localization) {
        return null;
    }

    @PostMapping("/notStarted")
    public List<Course> findAllNotStarted(@RequestParam(name = "notStarted") String started) {
        return null;
    }

    @PostMapping("/started")
    public List<Course> findAllStarted(@RequestParam(name = "started") String started) {
        return null;
    }
}
