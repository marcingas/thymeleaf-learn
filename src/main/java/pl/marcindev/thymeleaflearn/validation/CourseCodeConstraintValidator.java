package pl.marcindev.thymeleaflearn.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    private String coursePrefix;
    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = code.startsWith(coursePrefix);
        return result;
    }

    @Override
    public void initialize(CourseCode courseCode) {
        coursePrefix=courseCode.value();

    }
}
