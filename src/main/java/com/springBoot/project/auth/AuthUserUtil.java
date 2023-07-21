package com.springBoot.project.auth;

import com.springBoot.project.model.AuthUser;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuthUserUtil {

    protected AuthUser getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            AuthUser authUser = (AuthUser) authentication.getPrincipal();
            return authUser;
        }
        return null;
    }
}
