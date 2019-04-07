package pl.com.ptaq.courses.service;

import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.model.CourseEntity;

public class CourseMapper {

    public static CourseEntity map (Course course){
        CourseEntity ce = new CourseEntity();

        ce.setCourseName(course.getCourseName());
        ce.setCourseProfile(course.getCourseProfile());
        ce.setCourseType(course.getCourseType());
        ce.setLocalization(course.getLocalization());
        ce.setStartDate(course.getStartDate());
        ce.setCourseDescription(course.getCourseDescription());

        return ce;
    }

    public static Course map (CourseEntity courseEntity){
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
