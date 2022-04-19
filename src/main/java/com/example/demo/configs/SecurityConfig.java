package com.example.demo.configs;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //auth.userDetailsService();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.formLogin().disable()
//                .csrf().disable()
//                .httpBasic().and()
//                .authorizeRequests()
//                .antMatchers("/api/public").permitAll()
//                .antMatchers(HttpMethod.POST).hasRole("ADMIN")
//                .antMatchers(HttpMethod.PUT).hasRole("ADMIN")
//                .anyRequest().authenticated();
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
