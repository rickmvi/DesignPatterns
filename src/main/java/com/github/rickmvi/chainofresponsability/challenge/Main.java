package com.github.rickmvi.chainofresponsability.challenge;

import com.github.rickmvi.chainofresponsability.challenge.service.ValidateInterface;
import com.github.rickmvi.chainofresponsability.challenge.service.internal.ValidateEmail;
import com.github.rickmvi.chainofresponsability.challenge.service.internal.ValidateName;
import com.github.rickmvi.chainofresponsability.challenge.service.internal.ValidatePassword;
import com.github.rickmvi.chainofresponsability.challenge.service.internal.ValidateUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ValidateInterface test = new ValidateName();
        test.setNext(new ValidateEmail())
                .setNext(new ValidatePassword())
                .setNext(new ValidateUser());

        System.out.println("Enter with user data: ");
        //String name = scanner.nextLine();
        String email = scanner.nextLine();
        //String password = scanner.nextLine();
        System.out.println("Is valid: " + test.isValid( email));
    }
}
