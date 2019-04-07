package pl.com.ptaq.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.repository.CourseRepository;

import java.util.List;

public class ReadCourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findByCourseType(){

        return null;
    }

}
