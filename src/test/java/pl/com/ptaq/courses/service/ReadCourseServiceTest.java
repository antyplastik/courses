package pl.com.ptaq.courses.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.repository.CourseRepository;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ReadCourseServiceTest {

    @Mock
    CourseRepository courseRepository;

    private ReadCourseService readCourseService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        readCourseService = new ReadCourseService(courseRepository);
    }

    @Test
    public void isExist() {
        Course expected = new Course().builder()
                .courseIdNumber("JAVAWWA13")
                .courseName("Junior Java Developer")
                .courseDescription("test4")
                .localization("test4a")
                .startDate("2018-10-16")
                .courseType("zaoczny")
                .courseProfile("developer")
                .build();

        Mockito.when(readCourseService.isExist(expected)).thenReturn(true);

        assertTrue(readCourseService.isExist(expected));
    }

    @Test
    public void findByCourseType() {
    }

    @Test
    public void findByCourseProfile() {
    }

    @Test
    public void findByCourseLocalization() {
    }

    @Test
    public void findCoursesNotStarted() {
    }

    @Test
    public void findCoursesStarted() {
    }
}