package com.spring.register.registration;

import java.util.function.Predicate;

public class EmailValidator implements Predicate<String> {
    @Override
    public boolean test(String s) {
        // TODO : REGEX to validate email
        return true;
    }
}
