package com.brainacad.studyproject.data.core;

import com.brainacad.studyproject.data.domain.Role;
import com.brainacad.studyproject.data.domain.User;

import java.util.Collection;
import java.util.HashSet;

import static com.brainacad.studyproject.data.domain.Role.ADMIN;
import static com.brainacad.studyproject.data.domain.Role.USER;

/**
 * Created by Fujitsu on 01.11.2016.
 */
public class StubDataHolder {

    private static HashSet users;
    private static boolean created = false;

    public static void createData(){
        if (!created) {
            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword("admin");
            admin.setRole(ADMIN);

            User user = new User();
            user.setUsername("user");
            user.setPassword("user");
            user.setRole(USER);

            users = new HashSet();
            users.add(admin);
            users.add(user);

            created = true;
        }
    }

    public static Collection<User> getUsers(){
        return users;
    }

}
