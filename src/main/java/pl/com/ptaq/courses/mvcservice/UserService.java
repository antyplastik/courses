package pl.com.ptaq.courses.mvcservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.ptaq.courses.domain.repository.CourseRepository;

@Service
public class UserService {

    @Autowired
    CourseRepository courseRepository;

    public UserService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }



}
