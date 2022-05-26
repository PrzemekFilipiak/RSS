package com.zdjavapol110.rss.core.modules.registration;


import com.zdjavapol110.rss.core.modules.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private UserRepository userRepository;

}
