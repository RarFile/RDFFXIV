package com.raid.recruit.ffxiv.service;

import com.raid.recruit.ffxiv.model.User;
import com.raid.recruit.ffxiv.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
