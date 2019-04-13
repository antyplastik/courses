package pl.com.ptaq.courses.service;

import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.model.CourseEntity;
import pl.com.ptaq.courses.domain.repository.CourseRepository;
import pl.com.ptaq.courses.service.mappers.CourseMapper;
import pl.com.ptaq.courses.service.mappers.CourseProfileMapper;
import pl.com.ptaq.courses.service.mappers.CourseTypeMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReadCourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public ReadCourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public boolean isExist(Course course) {
        CourseEntity entity = CourseMapper.mapToDatabaseObject(course);
        List<CourseEntity> entities = courseRepository.findByCourseNameAndAndCourseProfileAndCourseTypeAndStartDate(
                entity.getCourseName(),
                entity.getCourseProfile(),
                entity.getCourseType(),
                entity.getStartDate());
        return (entities.size() > 0) ? true : false;
    }

    public List<Course> findByCourseType(String type) {
        return courseRepository.findAllByCourseType(CourseTypeMapper.mapToCourseType(type))
                .stream()
                .map(CourseMapper::map)
                .collect(Collectors.toList());
    }

    public List<Course> findByCourseProfile(String profile) {
        return courseRepository.findAllByCourseProfile(CourseProfileMapper.mapToCourseProfile(profile))
                .stream()
                .map(CourseMapper::map)
                .collect(Collectors.toList());
    }

    public List<Course> findByCourseLocalization(String localization) {
        return courseRepository.findAllByLocalization(localization)
                .stream()
                .map(CourseMapper::map)
                .collect(Collectors.toList());
    }

    public List<Course> findCoursesNotStarted() {
        return courseRepository.findAllByStartDateAfter(LocalDate.now())
                .stream()
                .map(CourseMapper::map)
                .collect(Collectors.toList());
    }

    public List<Course> findCoursesStarted() {
        return courseRepository.findAllByStartDateBefore(LocalDate.now())
                .stream()
                .map(CourseMapper::map)
                .collect(Collectors.toList());
    }
}
