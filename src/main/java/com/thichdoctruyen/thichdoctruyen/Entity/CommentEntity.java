package com.thichdoctruyen.thichdoctruyen.Entity;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class CommentEntity extends BaseEntity {

    @Column(name = "content", nullable = false)
    private String content;

    //book n - 1 cmt
    @ManyToOne
    @JoinColumn(name = "bookid")
    private BookEntity book;


    // user n - 1 cmt
    @ManyToOne
    @JoinColumn(name = "userid")
    private UserEntity user;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BookEntity getBook() {
        return book;
    }

    public void setBook(BookEntity book) {
        this.book = book;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}