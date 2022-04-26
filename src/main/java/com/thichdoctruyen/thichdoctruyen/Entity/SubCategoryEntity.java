package com.thichdoctruyen.thichdoctruyen.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "subcategory")
public class SubCategoryEntity extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true)
    private String name;


    @ManyToOne
    @JoinColumn(name = "categoryid")
    private CategoryEntity category;

    @ManyToMany(mappedBy = "subCategorys")
    private List<BookEntity> books = new ArrayList<>();

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }

    public CategoryEntity getCategory() {
        return category;
    }


    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}