package com.spring.register.registration;

import com.spring.register.appuser.AppUser;
import com.spring.register.appuser.AppUserRole;
import com.spring.register.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        boolean isEmailValid = emailValidator.test(request.getEmail());

        if (!isEmailValid) {
            throw new IllegalStateException("email not valid");
        }

        return appUserService.signUpUser(new AppUser(request.getFirstName(), request.getLastName(), request.getEmail(), request.getPassword(), AppUserRole.USER));
    }
}
