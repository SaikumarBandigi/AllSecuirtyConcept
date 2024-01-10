package com.AllSecuirtyConcept.advdbsec.service.impl;

import com.AllSecuirtyConcept.advdbsec.dao.UserDetailsDao;
import com.AllSecuirtyConcept.advdbsec.entities.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDetailsDao userDetailsDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserInfo userDetailsobj = userDetailsDao.getActiveUser(username);
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(userDetailsobj.getRole());

        User user = new User(userDetailsobj.getName(), userDetailsobj.getPassword(), Arrays.asList(grantedAuthority));

        UserDetails userDetails =(UserDetails) user;
        return userDetails;
    }


}
