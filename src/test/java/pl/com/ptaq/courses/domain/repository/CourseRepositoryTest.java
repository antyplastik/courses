package pl.com.ptaq.courses.domain.repository;

import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.test.context.junit4.SpringRunner;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.model.CourseEntity;
import pl.com.ptaq.courses.domain.model.enums.CourseType;
import pl.com.ptaq.courses.service.mappers.CourseMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@DataJpaTest
@RunWith(SpringRunner.class)
public class CourseRepositoryTest {

    @Autowired
    CourseRepository courseRepository;

    @Before
    public void setUp() throws Exception {
        Course entity1 = new Course().builder()
                .courseIdNumber("TESTERWWA9")
                .courseName("Manual Tester")
                .courseDescription("test2")
                .localization("test2a")
                .startDate("2019-02-02")
                .courseType("dzienny")
                .courseProfile("tester")
                .build();

        Course entity2 = new Course().builder()
                .courseIdNumber("ADMINLU3")
                .courseName("Admin")
                .courseDescription("test3")
                .localization("test3a")
                .startDate("2019-04-20")
                .courseType("wieczorowy")
                .courseProfile("admin")
                .build();

        Course entity3 = new Course().builder()
                .courseIdNumber("JAVAWWA13")
                .courseName("Junior Java Developer")
                .courseDescription("test4")
                .localization("test4a")
                .startDate("2018-10-16")
                .courseType("zaoczny")
                .courseProfile("developer")
                .build();

        Course entity4 = new Course().builder()
                .courseIdNumber("JAVAWWA3")
                .courseName("Junior Java Developer")
                .courseDescription("test4")
                .localization("test4a")
                .startDate("2017-10-16")
                .courseType("zaoczny")
                .courseProfile("developer")
                .build();

        List<Course> courses = Arrays.asList(entity1, entity2, entity3, entity4);

        courses.stream().forEach(entity -> courseRepository.save(CourseMapper.mapToDatabaseObject(entity)));
    }

    @Test
    public void whenDateGreaterThan20190207_thenReturn1() {
        Assert.assertEquals(courseRepository.findAllByStartDateAfter(new LocalDate("2019-02-07")).size(), 1);
    }

    @Test
    public void whenDateLowerThan20190207_thenReturn3(){
        Assert.assertEquals(courseRepository.findAllByStartDateBefore(new LocalDate("2019-02-07")).size(), 3);
    }
}