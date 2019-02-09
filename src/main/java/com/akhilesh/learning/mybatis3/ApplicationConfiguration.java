package com.akhilesh.learning.mybatis3;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class ApplicationConfiguration {

    private final BasicDataSource dataSource;

    public ApplicationConfiguration(final BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
