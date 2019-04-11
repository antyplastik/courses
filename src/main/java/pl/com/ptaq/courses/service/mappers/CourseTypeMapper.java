package pl.com.ptaq.courses.service.mappers;

import pl.com.ptaq.courses.domain.model.enums.CourseType;

public class CourseTypeMapper {

    public static CourseType mapToCourseType(String courseType) {
        courseType = courseType.toUpperCase();

        if (courseType != null || !courseType.equals("")) {
            if (CourseType.DAILY.toString().equals(courseType))
                return CourseType.DAILY;

            else if (CourseType.NIGHTLY.toString().equals(courseType))
                return CourseType.NIGHTLY;

            else if (CourseType.EXTRAMURAL.toString().equals(courseType))
                return CourseType.EXTRAMURAL;
        }

        return null;
    }

    public static String mapToString(CourseType courseType) {
        return courseType.toString();
    }

}
