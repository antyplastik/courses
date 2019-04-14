package pl.com.ptaq.courses.domain.model;

import lombok.*;
import org.joda.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Course {

    @Max(50)
    @NotEmpty
    @NotNull
    private String courseIdNumber;
    @NotEmpty
    @Max(255)
    private String courseName;
    @NotEmpty
    private String courseDescription;
    @NotEmpty
    private String localization;
    @NotEmpty
    @Future
    private String startDate;

    @NotEmpty
    private String courseType;
    @NotEmpty
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
