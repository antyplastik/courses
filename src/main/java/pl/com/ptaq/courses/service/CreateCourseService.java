package pl.com.ptaq.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.model.CourseEntity;
import pl.com.ptaq.courses.domain.repository.CourseRepository;

public class CreateCourseService {

    @Autowired
    private CourseRepository repository;


    public boolean addCourse(Course course){
        repository.save(CourseMapper.map(course));
        return false;
    }

}
