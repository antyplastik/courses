package pl.com.ptaq.courses.domain.model.enums;

public enum CourseType {
    DAILY("DZIENNY"),
    NIGHTLY("WIECZOROWY"),
    EXTRAMURAL("ZAOCZNY");

    private String type;

    CourseType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
