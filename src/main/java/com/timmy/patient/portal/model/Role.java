package com.timmy.patient.portal.model;

import javax.persistence.*;
import java.util.Set;

//Specifies that the class is an entity.
@Entity
//Specifies the primary table for the annotated entity, and the class name of the entity will be used as the table name.
@Table(name = "role")
public class Role {
    // Id Specifies the primary key of an entity.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    // Many to many relationship between 2 entities
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
