package com.github.rickmvi.chainofresponsability.challenge.service.internal;

import com.github.rickmvi.chainofresponsability.challenge.service.ValidateHandler;

import java.util.regex.Pattern;

public class ValidateEmail extends ValidateHandler {
    @Override
    public boolean isValid(String value) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        if (pattern.matcher(value).matches()) return true;

        return next(value);
    }
}
