package com.driver.models;

import javax.persistence.*;


@Entity
@Table
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Description;
    @Column(nullable = false)
    private String Dimensions;
    public Image() {
    }
    public Image(String description, String dimensions) {
        this.Description = description;
        this.Dimensions = dimensions;
    }
    public int getId() {

        return Id;
    }
    public void setId(int id) {

        this.Id = id;
    }
    public String getDescription() {

        return Description;
    }
    public void setDescription(String description) {
        this.Description = description;
    }
    public String getDimensions() {

        return Dimensions;
    }
    public void setDimensions(String dimensions) {

        this.Dimensions = dimensions;
    }
    @ManyToOne
    @JoinColumn
    private Blog blog;
    public void setBlog(Blog blog) {

        this.blog = blog;
    }
    public Blog getBlog() {

        return blog;
    }

}