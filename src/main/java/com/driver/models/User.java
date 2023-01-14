package com.driver.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String userName;
    private String passWord;
    private String firstName;
    private String lastName;
    public User(String username, String password, String firstName, String lastName) {
        this.userName = username;
        this.passWord = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public User() {
    }
    public int getId() {

        return Id;
    }
    public void setId(int id) {

        this.Id = id;
    }
    public String getUsername() {

        return userName;
    }
    public void setUsername(String username) {

        this.userName = username;
    }
    public String getPassword() {

        return passWord;
    }
    public void setPassword(String password) {

        this.passWord = password;
    }
    public String getFirstName() {

        return firstName;
    }
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }
    public String getLastName() {

        return lastName;
    }
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Blog> blogList;
    public List<Blog> getBlogList() {

        return blogList;
    }
    public void setBlogList(List<Blog> blogList) {

        this.blogList = blogList;
    }
}