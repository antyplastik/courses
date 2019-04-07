package pl.com.ptaq.courses.domain.model.enums;

public enum CourseProfile {
    TESTER("TESTER"),
    ADMIN("ADMIN"),
    DEVELOPER("DEVELOPER");

    private String profile;

    CourseProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return profile;
    }
}
