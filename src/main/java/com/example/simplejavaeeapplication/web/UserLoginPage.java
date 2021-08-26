package com.example.simplejavaeeapplication.web;

import com.example.simplejavaeeapplication.ejb.UserBean;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class UserLoginPage implements Serializable {
    private String username;
    private String password;

    // TODO 接入service层
    @EJB
    private UserBean userBean;

    /**
     * <a href="https://stackoverflow.com/questions/15521451/how-to-navigate-in-jsf-how-to-make-url-reflect-current-page-and-not-previous-o">JSF页面跳转，但是url不变的解决方案</a>
     * @return
     */
    public String login() {
        boolean userExist = userBean.checkUserExist(username, password);
        if (userExist) {
            return "successLogin.xhtml?faces-redirect=true";
        }
        return "errorLogin.xhtml?faces-redirect=true";
    }

    public String backToIndex() {
        return "index.xhtml?faces-redirect=true";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
