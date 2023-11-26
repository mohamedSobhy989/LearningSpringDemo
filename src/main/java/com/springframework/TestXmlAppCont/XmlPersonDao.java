package com.springframework.TestXmlAppCont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class XmlPersonDao {

    XmlJdbcConnection xmlJdbcConnection ;

    public XmlJdbcConnection getXmlJdbcConnection() {
        return xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }
}
