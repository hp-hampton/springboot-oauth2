package com.hup.oauth.userdetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * @author hupeng on 2018/11/8
 * @version 1.0
 * @Description
 */
@Data
@AllArgsConstructor
public class DefaultUserDetails implements UserDetails {

    List<SimpleGrantedAuthority> authorities;

    String password;

    String username;

    boolean expired;

    boolean locked;

    boolean nonExpired;

    boolean enabled;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return expired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return locked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return nonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
