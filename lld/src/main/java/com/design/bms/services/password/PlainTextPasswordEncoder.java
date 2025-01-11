package com.lld.sysdesign.bms.services.password;

import org.springframework.stereotype.Service;

@Service
public class PlainTextPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(String password) {
        return "encoded -" + password;
    }

}
