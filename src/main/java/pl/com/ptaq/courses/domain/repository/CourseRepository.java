package pl.com.ptaq.courses.domain.repository;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.model.CourseEntity;
import pl.com.ptaq.courses.domain.model.enums.CourseProfile;
import pl.com.ptaq.courses.domain.model.enums.CourseType;

import java.util.List;
import java.util.UUID;

@Repository
public interface CourseRepository extends PagingAndSortingRepository<CourseEntity, UUID> {

    List<CourseEntity> findAllByCourseType(CourseType courseType);

    List<CourseEntity> findAllByLocalization(String localization);

    List<CourseEntity> findAllByCourseProfile(CourseProfile courseProfile);

    List<CourseEntity> findAllByStartDateBefore(LocalDate date);

    List<CourseEntity> findAllByStartDateAfter(LocalDate date);

    List<CourseEntity> findByCourseNameAndAndCourseProfileAndCourseTypeAndStartDate(String courseName, CourseProfile profile, CourseType type, LocalDate startDate);

}
