package com.springframework.Basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ComponantDao {

    @Autowired
    ComponantJdbcConnection jdbcCon ;

    public ComponantJdbcConnection getJdbcCon() {
        return jdbcCon;
    }

    public void setJdbcCon(ComponantJdbcConnection jdbcCon) {
        this.jdbcCon = jdbcCon;
    }
}
