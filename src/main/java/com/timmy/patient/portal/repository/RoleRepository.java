package com.timmy.patient.portal.repository;

import com.timmy.patient.portal.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Jpa Repositories help to reduce boilerplate code required to implement data access layer
 * The normal way to access data access layer is
 * 1) a access layer class holds an instance of sql connection to the database
 * 2) constructing CRUD sql operations in the data access layer class
 * 3) execute constructed CRUD sql operations
 */
public interface RoleRepository extends JpaRepository<Role, Long>{
}
