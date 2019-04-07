package pl.com.ptaq.courses.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.repository.CourseRepository;

import java.util.List;

@Service
public class ReadCourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findByCourseType(String type){
//        courseRepository.findAllByCourseType();
        return null;
    }

    public List<Course> findByCourseProfile(){

        return null;
    }
    public List<Course> findByCourseLocalization(){

        return null;
    }
    public List<Course> findCoursesNotStarted(){

        return null;
    }
    public List<Course> findCoursesStarted(){

        return null;
    }
}
