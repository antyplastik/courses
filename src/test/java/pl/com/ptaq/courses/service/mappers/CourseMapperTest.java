package pl.com.ptaq.courses.service.mappers;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.joda.time.LocalDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import pl.com.ptaq.courses.domain.model.Course;
import pl.com.ptaq.courses.domain.model.CourseEntity;
import pl.com.ptaq.courses.domain.model.enums.CourseProfile;
import pl.com.ptaq.courses.domain.model.enums.CourseType;

@RunWith(JUnitParamsRunner.class)
public class CourseMapperTest {

    private CourseMapper mapper;

    @Test
    @Parameters(method = "localDateTestObj")
    public void mapToDatabase(String input, LocalDate expected) {
//        org.hamcrest.JavaLangMatcherAssert.that();
    }

    public Object[] localDateTestObj() {
        return new Object[]{
                new Object[]{
                        "2019-01-01",
                        new LocalDate(2019,1,1)
                }

    };
}

    @Test
    @Parameters(method = "mapPojoToEntity")
    public void map(CourseEntity actual, Course expected) {
//        org.hamcrest.JavaLangMatcherAssert.that();
    }

    public Object[] mapPojoToEntity(String input, Course expected) {
        return new Object[]{
                new Object[]{
                        new Course().builder()
                                .courseIdNumber("JAVAWWA20")
                                .courseName("Junior Java Developer")
                                .courseDescription("test1")
                                .courseProfile("developer")
                                .courseType("dzienny")
                                .localization("test2")
                                .startDate("2019-01-01")
                                .build(),

                        new CourseEntity(
                                null,
                                "JAVAWWA20",
                                "Junior Java Developer",
                                "test1",
                                "test2",
                                new LocalDate("2019-01-01"),
                                CourseType.DAILY,
                                CourseProfile.DEVELOPER,
                                null
                        )
                }
        };
    }
}