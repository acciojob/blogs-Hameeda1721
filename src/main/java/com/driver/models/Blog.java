package com.driver.models;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Title;
    private String Context;
    private Date Date;
    public Blog() {
    }
    public int getId() {

        return Id;
    }
    public void setId(int id) {

        this.Id = id;
    }
    public String getTitle() {

        return Title;
    }
    public void setTitle(String title) {

        this.Title = title;
    }
    public String getContent() {

        return Context;
    }
    public void setContent(String content) {

        this.Context = content;
    }
    public Date getPubDate() {

        return Date;
    }
    public void setPubDate(Date pubDate) {

        this.Date = Date;
    }
    public Blog(String title, String content) {
        this.Title = title;
        this.Context = content;
    }
    @ManyToOne
    @JoinColumn
    private User user;
    public User getUser() {

        return user;
    }
    public void setUser(User user) {

        this.user = user;
    }
    @OneToMany(mappedBy = "blog", cascade = CascadeType.ALL)
    private List<Image> imageList;
    public List<Image> getImageList() {

        return imageList;
    }
    public void setImageList(List<Image> imageList) {

        this.imageList = imageList;
    }
}