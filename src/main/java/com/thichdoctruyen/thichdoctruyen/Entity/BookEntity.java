package com.thichdoctruyen.thichdoctruyen.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book")
public class BookEntity extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "numberofchapters", nullable = false)
    private Long numberOfChapters;

    @Column(name = "photo", nullable = false)
    private String photo;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "author", nullable = false)
    private String author;

    @ManyToOne
    @JoinColumn(name = "typeofbookid")
    private TypeOfBookEntity typeOfBook;

    @ManyToOne
    @JoinColumn(name = "categoryid")
    private CategoryEntity category;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "subcategory_book",
            joinColumns = @JoinColumn(name = "bookid"),  // TRong đó, khóa ngoại chính là address_id trỏ tới class hiện tại (Address)
            inverseJoinColumns = @JoinColumn(name = "subcategoryid") //Khóa ngoại thứ 2 trỏ tới thuộc tính ở dưới (Person)
    )
    private List<SubCategoryEntity> subCategorys = new ArrayList<>();


    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<ChapterEntity> chapters = new ArrayList<>();

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<CommentEntity> comments = new ArrayList<>();

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<UserInteractionEntity> userInteractions = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumberOfChapters() {
        return numberOfChapters;
    }

    public void setNumberOfChapters(Long numberOfChapters) {
        this.numberOfChapters = numberOfChapters;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public TypeOfBookEntity getTypeOfBook() {
        return typeOfBook;
    }

    public void setTypeOfBook(TypeOfBookEntity typeOfBook) {
        this.typeOfBook = typeOfBook;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public List<SubCategoryEntity> getSubCategorys() {
        return subCategorys;
    }

    public void setSubCategorys(List<SubCategoryEntity> subCategorys) {
        this.subCategorys = subCategorys;
    }

    public List<ChapterEntity> getChapters() {
        return chapters;
    }

    public void setChapters(List<ChapterEntity> chapters) {
        this.chapters = chapters;
    }
}