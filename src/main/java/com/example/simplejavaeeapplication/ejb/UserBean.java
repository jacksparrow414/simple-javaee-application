package com.example.simplejavaeeapplication.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserBean {

    @PersistenceContext(unitName = "simple")
    private EntityManager entityManager;

    /**
     * count使用getSingleResult
     * <a href="https://stackoverflow.com/questions/21733673/jpa-count-with-composite-primary-key-query-not-working">JPA中count写法问题</a>
     */
    public boolean checkUserExist(String username, String password) {
        long result = (long) entityManager.createNamedQuery("countUser")
                .setParameter("userName", username)
                .setParameter("passWord", password).getSingleResult();
        return result == 0 ? false : true;
    }
}
