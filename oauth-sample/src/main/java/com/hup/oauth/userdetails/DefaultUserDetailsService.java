package com.hup.oauth.userdetails;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author hupeng on 2018/11/8
 * @version 1.0
 * @Description
 */
@Service
public class DefaultUserDetailsService implements UserDetailsService {

    private final String ROLE_USER = "ROLE_USER";


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new DefaultUserDetails(Arrays.asList(new SimpleGrantedAuthority(ROLE_USER)), "{noop}123456", "admin", true, true, true, true);
    }
}
