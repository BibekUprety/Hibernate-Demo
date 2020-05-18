package com.example.demo.Model;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity(name = "Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime postTime;
    @ManyToOne
    private User user;
    private String details;

    public Post() {
    }

    public Post(int id, LocalDateTime postTime, User user, String details) {
        this.id = id;
        this.postTime = postTime;
        this.user = user;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getPostTime() {
        return postTime;
    }

    public void setPostTime(LocalDateTime postTime) {
        this.postTime = postTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
