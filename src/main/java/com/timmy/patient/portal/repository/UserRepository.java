package com.timmy.patient.portal.repository;

import com.timmy.patient.portal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Jpa Repositories help to reduce boilerplate code required to implement data access layer
 * The normal way to access data access layer is
 * 1) a access layer class holds an instance of sql connection to the database
 * 2) constructing CRUD sql operations in the data access layer class
 * 3) execute constructed CRUD sql operations
 *
 * JPA provides some CRUD operations: they are
 * 1) findAll,
 * 2) findByd,
 * 3) save
 * 4) saveAll
 * 5) delete
 * 6) deleteAll
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
