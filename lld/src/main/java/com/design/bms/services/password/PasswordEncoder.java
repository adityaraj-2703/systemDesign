package com.lld.sysdesign.bms.services.password;

import org.springframework.stereotype.Service;

@Service
public interface PasswordEncoder {
    String encode(String password);
}
