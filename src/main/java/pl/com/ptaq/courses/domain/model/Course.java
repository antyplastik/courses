package pl.com.ptaq.courses.domain.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import pl.com.ptaq.courses.validators.LocalizationConstraint;

import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Course {

    @Size(max = 255)
    @NotEmpty
    @NotNull
    private String courseIdNumber;
    @NotEmpty
    @Size(max = 255)
    private String courseName;
    @NotEmpty
    private String courseDescription;
    @NotBlank
//    @LocalizationConstraint()
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
