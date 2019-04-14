package pl.com.ptaq.courses.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LocalizationValidator implements ConstraintValidator<LocalizationConstraint, String> {

    @Override
    public void initialize(LocalizationConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        int spaceIndex = 0;

        for (Character character : s.toCharArray())
            if (character.equals(" "))
                spaceIndex++;

        if (spaceIndex < 6)
            return true;

        return false;
    }
}
