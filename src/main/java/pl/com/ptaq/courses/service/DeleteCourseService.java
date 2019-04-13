package pl.com.ptaq.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.model.CourseEntity;
import pl.com.ptaq.courses.domain.repository.CourseRepository;
import pl.com.ptaq.courses.service.mappers.CourseMapper;

@Service
public class DeleteCourseService {

    @Autowired
    private CourseRepository courseRepository;

    public DeleteCourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void deleteCourseFromDatabase(Course course){
        CourseEntity courseToDel = courseRepository.findByCourseIdNumber(course.getCourseIdNumber());
        courseRepository.deleteById(courseToDel.getId());
    }
}
