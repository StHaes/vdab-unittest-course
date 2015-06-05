package com.realdolmen;


import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by jeansmits on 5/06/15.
 */

public class SuperClassOfTests {
    @Before
    public void initializeDB() throws Exception {
        java.sql.Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        IDatabaseConnection connection = new DatabaseConnection(c);

        IDataSet peopleDataSet = new FlatXmlDataSetBuilder().build(new File("data.xml"));

        DatabaseOperation.CLEAN_INSERT.execute(connection,peopleDataSet);
    }

//    @Test
//    public void testPersonFoundByID() throws Exception {
//        Person p = new JdbcPersonRepository().find(1);
//        assertEquals("jimi",p.getFirstName());
//
//    }
}
