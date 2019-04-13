package pl.com.ptaq.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.model.CourseEntity;
import pl.com.ptaq.courses.domain.repository.CourseRepository;
import pl.com.ptaq.courses.service.mappers.CourseMapper;

@Service
public class UpdateCourseService {

    private final CourseRepository courseRepository;
    private final ReadCourseService readCourseService;

    @Autowired
    public UpdateCourseService(CourseRepository courseRepository, ReadCourseService readCourseService) {
        this.courseRepository = courseRepository;
        this.readCourseService = readCourseService;
    }

    public boolean update(Course updated){
        Boolean result = false;
        CourseEntity old = courseRepository.findByCourseIdNumber(updated.getCourseIdNumber());

        if (old != null) {
            CourseEntity updatedEnt = CourseMapper.mapToDatabaseObject(updated);
            updatedEnt.setId(old.getId());
            courseRepository.save(updatedEnt);

            result = readCourseService.isExist(CourseMapper.map(updatedEnt));
        }
        return result;
    }
}
