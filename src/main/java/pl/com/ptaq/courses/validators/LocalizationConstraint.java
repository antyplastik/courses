package pl.com.ptaq.courses.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = LocalizationValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LocalizationConstraint {
    String message() default "Custom constraint not satisfied";

    Class<?>[] groups() default {}; // only for Spring

    Class<? extends Payload>[] payload() default {}; // only for Spring
}
