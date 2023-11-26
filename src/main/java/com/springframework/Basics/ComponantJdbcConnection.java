package com.springframework.Basics;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
// scope annotation contain singelton, prototype,...--> singelton retun one bean for all app context
//--> prototype deffrent beant every request
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Component  // this annotation make container consider this is a bean
public class ComponantJdbcConnection {
    public ComponantJdbcConnection(){
        System.out.println("JDBC Connection Success");
    }
}
