package com.realdolmen;


import junit.framework.Assert;
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
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by jeansmits on 5/06/15.
 */

public class SuperClassOfTests {
    @Before
    public void initializeDB() throws Exception {
        java.sql.Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
        IDatabaseConnection connection = new DatabaseConnection(c);

        IDataSet peopleDataSet = new FlatXmlDataSetBuilder().build(new File("people.xml"));

        DatabaseOperation.CLEAN_INSERT.execute(connection,peopleDataSet);
    }

    @Test
    public void testPersonFoundByIDAndFirstname() throws Exception {
        Person p = new JdbcPersonRepository().find(1);
        assertEquals("Jimi",p.getFirstName());

    }

    @Test
    public void testlastName() throws Exception {
        Person p = new JdbcPersonRepository().find(2);
        assertEquals("Joplin",p.getLastName());
    }

    @Test
    public void testBirthDateExists() throws Exception {
        Person p = new JdbcPersonRepository().find(1);
        assertEquals("2011-08-15",p.getBirthDate().toString());
    }

    @Test
    public void testAdressExists() throws Exception {
        Person p = new JdbcPersonRepository().find(1);
        assertEquals("Toverberg", p.getAddress().getStreet());
        assertEquals("6", p.getAddress().getNumber());
        assertEquals("Louvain", p.getAddress().getCity().getName());
        assertEquals("3001", p.getAddress().getCity().getPostalCode());
    }

    @Test
    public void testSaveNewPerson() throws Exception {
        JdbcPersonRepository j = new JdbcPersonRepository();
        Person p = new Person("Daenerys","Targaryen",new java.util.Date(2015-8-24),new Address("Mereen","6",new City("Westeros","1337")));
        j.save(p);
        assertEquals("Daenerys",j.find(3).getFirstName());
    }

    @Test
    public void testDeleteCreatedPersonAKATheQueenOfTheAndals() throws Exception {
        JdbcPersonRepository j = new JdbcPersonRepository();
//        Person p = new Person("Robert","Stark",new java.util.Date(2015-9-24),new Address("Winterfell","1337",new City("Beyond the wall","1337")));
//        j.save(p);
        try {
            j.remove(j.find(4));
            assertNull(j.find(4));
        } catch (NullPointerException n){
            n.getStackTrace();
        }


    }
}
