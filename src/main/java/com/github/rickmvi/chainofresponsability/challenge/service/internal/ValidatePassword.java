package com.github.rickmvi.chainofresponsability.challenge.service.internal;

import com.github.rickmvi.chainofresponsability.challenge.service.ValidateHandler;

import java.util.regex.Pattern;

public class ValidatePassword extends ValidateHandler {
    @Override
    public boolean isValid(String value) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{8,}");
        if (pattern.matcher(value).matches()) return true;

        return next(value);
    }
}
