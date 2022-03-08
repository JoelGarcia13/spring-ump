package com.cams.ump;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Table(name = "portal_users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    public User() {
        this.firstName = "";
        this.email = "";
        this.lastName = "";
    }

    public User(String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    @Override
    public String toString() {
        return "User{ id: " + id+ ", name=" + firstName + ", lastName=" + lastName + ", email=" + email + '}';
    }
}