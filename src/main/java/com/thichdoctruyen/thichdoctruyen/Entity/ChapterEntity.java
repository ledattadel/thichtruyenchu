package com.thichdoctruyen.thichdoctruyen.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "chapter")
public class ChapterEntity extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "ordinalnumber", nullable = false)
    private Long numberOfChapters;

    @Column(name = "content", nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(name = "bookid")
    private BookEntity book;


}