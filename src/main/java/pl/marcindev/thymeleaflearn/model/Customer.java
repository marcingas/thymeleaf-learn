package pl.marcindev.thymeleaflearn.model;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Customer {
    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "greater then 0")
    @Max(value = 10, message = "must be less then 11")
    private Integer freePasses;

    @Pattern(regexp = "[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

}
