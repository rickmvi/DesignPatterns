package com.github.rickmvi.chainofresponsability.challenge.service;

public abstract class ValidateHandler implements ValidateInterface {
    private ValidateInterface next;

    @Override
    public ValidateInterface setNext(ValidateInterface next) {
        this.next = next;
        return next;
    }

    protected boolean next(String value) {
        if (next == null) return false;

        return next.isValid(value);
    }
}
