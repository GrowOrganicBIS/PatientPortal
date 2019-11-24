package com.timmy.patient.portal.service;

import com.timmy.patient.portal.model.User;

/**
 * This interface provides service for registering account.
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
