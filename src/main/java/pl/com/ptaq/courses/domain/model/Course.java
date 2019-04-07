package pl.com.ptaq.courses.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.joda.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Course {

    private String courseName;
    private String courseDescription;
    private String localization;
    private LocalDate startDate;

    private CourseType courseType;
    private CourseProfile courseProfile;

}
