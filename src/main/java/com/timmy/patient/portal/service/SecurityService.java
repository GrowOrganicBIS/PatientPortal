package com.timmy.patient.portal.service;

/**
 * This interface is created to provide current logged-in user and auto login user after registration.
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
