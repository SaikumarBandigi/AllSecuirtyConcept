package com.AllSecuirtyConcept.advdbsec;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptPassWordEncoderTest {
    public static void main(String[] args) {

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        System.out.println(bCryptPasswordEncoder.encode("Sonu"));
        System.out.println(bCryptPasswordEncoder.encode("Ratna"));

    }
}
