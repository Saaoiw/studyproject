package com.brainacad.studyproject.data.dao.impl;

import com.brainacad.studyproject.data.dao.UserDao;
import com.brainacad.studyproject.data.domain.User;

/**
 * Created by Fujitsu on 01.11.2016.
 */
public class StubUserDao implements UserDao {

    @Override
    public User getUserByName(String username) {
        return null;
    }

}
