package com.github.rickmvi.chainofresponsability.challenge.service.internal;

import com.github.rickmvi.chainofresponsability.challenge.service.ValidateHandler;

public class ValidateUser extends ValidateHandler {
    @Override
    public boolean isValid(String value) {
        if (value == null || value.isEmpty()) return true;

        return next(value);
    }
}
