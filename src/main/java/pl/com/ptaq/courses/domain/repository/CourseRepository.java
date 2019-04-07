package pl.com.ptaq.courses.domain.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import pl.com.ptaq.courses.domain.model.CourseEntity;
import pl.com.ptaq.courses.domain.model.enums.CourseProfile;
import pl.com.ptaq.courses.domain.model.enums.CourseType;

import java.util.UUID;

@Repository
public interface CourseRepository extends PagingAndSortingRepository<CourseEntity, UUID> {

    CourseEntity findAllByCourseType(CourseType courseType);
    CourseEntity findByLocalization(String localization);
    CourseEntity findByCourseProfile(CourseProfile courseProfile);

}
