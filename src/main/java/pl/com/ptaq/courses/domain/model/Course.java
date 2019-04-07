package pl.com.ptaq.courses.domain.model;

import lombok.*;
import org.joda.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Course {

    private String courseName;
    private String courseDescription;
    private String localization;
    private String startDate;

    private String courseType;
    private String courseProfile;

}
