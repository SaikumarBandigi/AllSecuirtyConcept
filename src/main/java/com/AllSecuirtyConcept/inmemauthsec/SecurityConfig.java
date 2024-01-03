package com.AllSecuirtyConcept.inmemauthsec;


//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Autowired
//    public void config(AuthenticationManagerBuilder auth) throws Exception {
//        auth.
//                inMemoryAuthentication().
//                withUser("Sonu").
//                password("{noop}Sonu").
//                roles("ADMIN");
//
//
//    }
//
//    @Bean
//    public SecurityFilterChain config(HttpSecurity httpSecurity) throws Exception {
//
//        httpSecurity.csrf().disable().authorizeRequests()
//                .antMatchers("/api/inmem/getEmployees").hasRole("ADMIN").and().httpBasic();
//
//        return httpSecurity.build();
//    }
//
//
//}
