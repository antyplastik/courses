package pl.com.ptaq.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.model.CourseEntity;
import pl.com.ptaq.courses.domain.model.CourseType;
import pl.com.ptaq.courses.domain.repository.CourseRepository;

public class CreateCourseService {

    @Autowired
    private CourseRepository repository;


    public boolean addCourse(Course course){
        repository.save(map(course));
        return false;
    }

    private CourseEntity map (Course course){
        CourseEntity ce = new CourseEntity();

        ce.setCourseName(course.getCourseName());
        ce.setCourseProfile(course.getCourseProfile());
        ce.setCourseType(course.getCourseType());
        ce.setLocalization(course.getLocalization());
        ce.setStartDate(course.getStartDate());
        ce.setCourseDescription(course.getCourseDescription());

        return ce;
    }

    private Course map (CourseEntity courseEntity){
        Course c = new Course();

        c.setCourseName(courseEntity.getCourseName());
        c.setCourseProfile(courseEntity.getCourseProfile());
        c.setCourseType(courseEntity.getCourseType());
        c.setLocalization(courseEntity.getLocalization());
        c.setStartDate(courseEntity.getStartDate());
        c.setCourseDescription(courseEntity.getCourseDescription());

        return c;
    }
}
