package com.example.simplejavaeeapplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * USER表实体类.
 * <a href="https://stackoverflow.com/questions/21733673/jpa-count-with-composite-primary-key-query-not-working">JPA中count写法问题</a>
 */
@Table(name = "USER")
@Entity
@NamedQueries(
        @NamedQuery(name = "countUser" ,
                query = "SELECT COUNT(u.id) FROM User u WHERE u.userName= :userName AND u.passWord= :passWord")
)
public class User implements Serializable {
    @Id
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "PASS_WORD")
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
