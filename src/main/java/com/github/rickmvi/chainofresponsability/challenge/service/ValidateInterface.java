package com.github.rickmvi.chainofresponsability.challenge.service;

public interface ValidateInterface {
   boolean isValid(String value);
   ValidateInterface setNext(ValidateInterface next);
}
