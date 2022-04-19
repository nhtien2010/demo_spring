package com.example.demo.services.impls;

import com.example.demo.domains.UserModel;
import com.example.demo.repositories.AuthenticateRepository;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    final private UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserModel> user = userRepository.findByUsername(username);
        return user.orElse(
                userRepository.findByEmail(username).
                        orElseThrow(() -> new UsernameNotFoundException(format("user - %s, not exist", username)))
        );

//        if(user.isPresent()){
//            return user.get();
//        }
//        user = userRepository.findByEmail(username);
//        if(user.isPresent()){
//            return user.get();
//        }
    }
}
