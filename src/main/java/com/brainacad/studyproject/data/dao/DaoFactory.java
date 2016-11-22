package com.brainacad.studyproject.data.dao;

import com.brainacad.studyproject.data.dao.impl.StubDaoFactory;
import com.brainacad.studyproject.util.ApplicationUtils;

import java.util.Properties;

import static com.brainacad.studyproject.util.ApplicationConstants.DATASOURCE;
import static com.brainacad.studyproject.util.ApplicationConstants.DB;
import static com.brainacad.studyproject.util.ApplicationConstants.STUB;

/**
 * Created by Fujitsu on 01.11.2016.
 */
public abstract class DaoFactory {
    public abstract UserDao getUserDao();
    //TODO: getAdDao();

    public static DaoFactory getDaoFactory() {
        Properties properties = ApplicationUtils.readAppConfig();
        String datasource = properties.getProperty(DATASOURCE);
        switch (datasource) {
            case STUB:
                return new StubDaoFactory();
            case DB:
                return new JdbcDaoFactory();
            default:
                return new StubDaoFactory();
        }
    }
}
