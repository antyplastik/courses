package pl.com.ptaq.courses.service.mappers;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.model.CourseEntity;

public class CourseMapper {

    public static CourseEntity mapToDatabaseObject(Course course){
        CourseEntity ce = new CourseEntity();

        ce.setCourseName(course.getCourseName());
        ce.setCourseProfile(CourseProfileMapper.mapToCourseProfile(course.getCourseProfile()));
        ce.setCourseType(CourseTypeMapper.mapToCourseType(course.getCourseType()));
        ce.setLocalization(course.getLocalization());
        ce.setStartDate(mapStringToLocalDate(course.getStartDate()));
        ce.setCourseDescription(course.getCourseDescription());
        ce.setLastModification(addTimestamp());

        return ce;
    }

    public static Course map (CourseEntity courseEntity){
        Course c = new Course();

        c.setCourseName(courseEntity.getCourseName());
        c.setCourseProfile(courseEntity.getCourseProfile().toString());
        c.setCourseType(courseEntity.getCourseType().toString());
        c.setLocalization(courseEntity.getLocalization());
        c.setStartDate(courseEntity.getStartDate().toString());
        c.setCourseDescription(courseEntity.getCourseDescription());

        return c;
    }

    private static LocalDate mapStringToLocalDate(String date){
        return LocalDate.parse(date);
    }

    private static DateTime mapStringToDateTime(String timestamp){
        return DateTime.parse(timestamp);
    }

    private static DateTime addTimestamp(){
        DateTime date= DateTime.now();
        return date;
    }
}
