package com.open.auth.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author MrBird
 */
@Data
public class UserVO extends User{

    private String username;

    private String password;


    public UserVO(String username, String password, Collection<? extends GrantedAuthority> authorities, String username1, String password1) {
        super(username, password, authorities);
        username = username1;
        password = password1;
    }

    public UserVO(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }
}
