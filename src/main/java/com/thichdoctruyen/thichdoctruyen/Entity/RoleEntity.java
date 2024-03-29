package com.thichdoctruyen.thichdoctruyen.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String code;




    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)// khai báo mappedBy phải trùng tên với biến của ben RoleEntity
    private List<UserEntity> users = new ArrayList<>();


    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
