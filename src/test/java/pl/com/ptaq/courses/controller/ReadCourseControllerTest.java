package pl.com.ptaq.courses.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.repository.CourseRepository;
import pl.com.ptaq.courses.service.ReadCourseService;
import pl.com.ptaq.courses.service.mappers.CourseMapper;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ReadCourseControllerTest {

    @Mock
    private ReadCourseService readCourseService;

    @Autowired
    CourseRepository courseRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        readCourseService = new ReadCourseService(courseRepository);

        Course entity1 = new Course().builder()
                .courseName("Manual Tester")
                .courseDescription("test2")
                .localization("test2a")
                .startDate("2019-02-02")
                .courseType("dzienny")
                .courseProfile("tester")
                .build();

        Course entity2 = new Course().builder()
                .courseName("Admin")
                .courseDescription("test3")
                .localization("test3a")
                .startDate("2019-04-20")
                .courseType("wieczorowy")
                .courseProfile("admin")
                .build();

        Course entity3 = new Course().builder()
                .courseName("Junior Java Developer")
                .courseDescription("test4")
                .localization("test4a")
                .startDate("2018-10-16")
                .courseType("zaoczny")
                .courseProfile("developer")
                .build();

        Course entity4 = new Course().builder()
                .courseName("Junior Java Developer")
                .courseDescription("test4")
                .localization("test4a")
                .startDate("2018-10-16")
                .courseType("zaoczny")
                .courseProfile("developer")
                .build();

        List<Course> courses = Arrays.asList(entity1, entity2, entity3, entity4);

        courses.stream().forEach(entity -> courseRepository.save(CourseMapper.mapToDatabaseObject(entity)));
    }


    @Test
    public void findByType() {

//        Mockito.when().thenReturn();
//        HttpResponse<Course> courses =

    }

    @Test
    public void findByProfile() {
    }

    @Test
    public void findByLocalization() {
    }

    @Test
    public void findAllStarted() {
    }
}