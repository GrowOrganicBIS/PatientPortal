package com.timmy.patient.portal.model;

import javax.persistence.*;
import java.util.Set;

//Specifies that the class is an entity.
@Entity
//Specifies the primary table for the annotated entity, and the class name of the entity will be used as the table name.
@Table(name = "user")
public class User {
    // Id Specifies the primary key of an entity.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;
    //Specifies that the property or field is not persistent.
    @Transient
    private String passwordConfirm;
    // Many to many relationship between 2 entities
    @ManyToMany
    private Set<Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
