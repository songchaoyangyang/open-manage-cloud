package com.open.auth.service.impl;

import com.open.auth.model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
@Service
public class OpenCloudUserDetailService implements UserDetailsService{
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserVO user = new UserVO(username,passwordEncoder.encode("123456"),true,
                true, true,true , AuthorityUtils.commaSeparatedStringToAuthorityList("user:add"));
        user.setUsername(username);
        user.setPassword(this.passwordEncoder.encode("123456"));
        List<String> permissionsList = new ArrayList<>();
        permissionsList.add("user:add");
        return user;
    }
}
