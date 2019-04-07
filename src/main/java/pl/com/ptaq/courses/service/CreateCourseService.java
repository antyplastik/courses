package pl.com.ptaq.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.repository.CourseRepository;
import pl.com.ptaq.courses.service.mappers.CourseMapper;

@Service
public class CreateCourseService {

    @Autowired
    private CourseRepository repository;

    public boolean addCourseToDatabase(Course course) {
        repository.save(CourseMapper.mapToDatabaseObject(course));

        return false;
    }

}
