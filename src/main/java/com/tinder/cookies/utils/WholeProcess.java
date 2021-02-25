package com.tinder.cookies.utils;

import com.tinder.dto.User;
import com.tinder.utils.Authenticator;
import com.tinder.utils.Persistence;

public class WholeProcess {
    private final com.tinder.utils.Persistence persistence;
    private final Authenticator authenticator;

    public WholeProcess(com.tinder.utils.Persistence persistence) {
        this.persistence = persistence;
        this.authenticator = new Authenticator(persistence);
    }

    public User user(int id) {
        return (User) persistence.getUserService().getDao().get(id);
    }

    public Persistence getPersistence() {
        return persistence;
    }

    public Authenticator.Result auth(String login, String passwd) {
        return this.authenticator.auth(login, passwd);
    }

    public Authenticator.Result register(String login, String pwd, String firstname, String lastname, String photolink) {
        System.out.println("authenticator");
        return authenticator.register(login, pwd, firstname, lastname, photolink);
    }
}
