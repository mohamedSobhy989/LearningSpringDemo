package com.springframework.learning.ExampleForBeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PersonDao {

    @Autowired
    JdbcConnection jdbcCon ;

    public JdbcConnection getJdbcCon() {
        return jdbcCon;
    }

    public void setJdbcCon(JdbcConnection jdbcCon) {
        this.jdbcCon = jdbcCon;
    }
}
