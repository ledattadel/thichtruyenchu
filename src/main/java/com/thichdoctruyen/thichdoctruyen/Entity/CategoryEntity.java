package com.thichdoctruyen.thichdoctruyen.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<BookEntity> books = new ArrayList<>();


    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<SubCategoryEntity> subCategorys = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(List<BookEntity> books) {
        this.books = books;
    }

    public List<SubCategoryEntity> getSubCategorys() {
        return subCategorys;
    }

    public void setSubCategorys(List<SubCategoryEntity> subCategorys) {
        this.subCategorys = subCategorys;
    }
}