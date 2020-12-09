package cn.barry.tu.baseadmin.config.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import cn.barry.tu.baseadmin.util.MD5Util;

@Component
public class PasswordConfig implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        //charSequence是用户输入的密码，password是存库的密码
        return MD5Util.getMD5(charSequence.toString());
    }

    @Override
    public boolean matches(CharSequence charSequence, String password) {
        return password.contentEquals(encode(charSequence));
    }
}
