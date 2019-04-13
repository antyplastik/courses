package pl.com.ptaq.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.repository.CourseRepository;
import pl.com.ptaq.courses.service.mappers.CourseMapper;
import pl.com.ptaq.courses.service.mappers.CourseProfileMapper;
import pl.com.ptaq.courses.service.mappers.CourseTypeMapper;

import java.util.Arrays;
import java.util.List;

@Service
public class CreateCourseService {

    private final CourseRepository repository;
    private final ReadCourseService read;

    @Autowired
    public CreateCourseService(CourseRepository repository, ReadCourseService read) {
        this.repository = repository;
        this.read = read;
    }

    public boolean addCourseToDatabase(Course course) {
        if (check(course))
            if (read.isExist(course))
                return true;
            else
                return repository.save(CourseMapper.mapToDatabaseObject(course)) != null ? true : false;
        else
            return false;
    }

    private boolean check(Course course) {
        List<String> tmp = Arrays.asList(course.toString().split(";"));

        boolean courseProfile = false;
        boolean courseType = false;

        for (String tmpStr : tmp) {
            if (tmpStr.equals("") || tmpStr == null)
                return false;

            if (CourseProfileMapper.mapToCourseProfile(tmpStr) != null)
                courseProfile = true;

            if (CourseTypeMapper.mapToCourseType(tmpStr) != null)
                courseType = true;
        }

        return true && courseProfile && courseType;
    }
}
