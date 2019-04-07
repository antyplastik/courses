package pl.com.ptaq.courses.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import pl.com.ptaq.courses.domain.model.enums.CourseProfile;
import pl.com.ptaq.courses.domain.model.enums.CourseType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseEntity {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    private String courseName;
    private String courseDescription;
    private String localization;

    private LocalDate startDate;

    private CourseType courseType;
    private CourseProfile courseProfile;

    private DateTime lastModification;

}
