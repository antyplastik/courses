package pl.com.ptaq.courses.mvcservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.ptaq.courses.domain.model.User;
import pl.com.ptaq.courses.domain.repository.CourseRepository;

@Service
public class UserService {

    @Autowired
    CourseRepository courseRepository;

    public UserService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public void addUser(){

    }

    public User findUser(String username, String password){

        return null;
    }

    public boolean updateUser(){

        return false;
    }

    public boolean deleteUser(){

        return false;
    }


}
