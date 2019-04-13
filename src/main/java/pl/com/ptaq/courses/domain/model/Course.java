package pl.com.ptaq.courses.domain.model;

import lombok.*;
import org.joda.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Course {

    private String courseIdNumber;
    private String courseName;
    private String courseDescription;
    private String localization;
    private String startDate;

    private String courseType;
    private String courseProfile;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(courseIdNumber).append(";")
                .append(courseName).append(";")
                .append(courseDescription).append(";")
                .append(localization).append(";")
                .append(startDate).append(";")
                .append(courseType).append(";")
                .append(courseProfile);
        return sb.toString();
    }
}
