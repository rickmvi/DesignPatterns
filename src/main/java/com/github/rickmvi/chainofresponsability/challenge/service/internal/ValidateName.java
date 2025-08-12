package com.github.rickmvi.chainofresponsability.challenge.service.internal;

import com.github.rickmvi.chainofresponsability.challenge.service.ValidateHandler;

public class ValidateName extends ValidateHandler {
    @Override
    public boolean isValid(String value) {
        if (value == null || value.isEmpty()) return false;

        return next(value);
    }
}
