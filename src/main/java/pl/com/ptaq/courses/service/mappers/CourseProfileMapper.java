package pl.com.ptaq.courses.service.mappers;

import pl.com.ptaq.courses.domain.model.enums.CourseProfile;
import pl.com.ptaq.courses.domain.model.enums.CourseType;

public class CourseProfileMapper {

    public static CourseProfile mapToCourseProfile(String courseProf){
        courseProf = courseProf.toUpperCase();

        if (courseProf != null || !courseProf.equals("")) {
            if (CourseProfile.ADMIN.toString().equals(courseProf))
                return CourseProfile.ADMIN;

            else if (CourseProfile.DEVELOPER.toString().equals(courseProf))
                return CourseProfile.DEVELOPER;

            else if (CourseProfile.TESTER.toString().equals(courseProf))
                return CourseProfile.TESTER;
        }

        return null;
    }

    public static String mapToString(CourseProfile courseProfile){
        return courseProfile.toString();
    }

}
