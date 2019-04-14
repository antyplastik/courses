package pl.com.ptaq.courses.domain.model;

import javax.validation.constraints.NotNull;

public class User {

    @NotNull
    private String username;

    @NotNull
    private String password;

}
