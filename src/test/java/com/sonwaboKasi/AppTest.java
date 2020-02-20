package com.sonwaboKasi;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @AfterClass
    public static void afterClass() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testEquality(){

        Employee empPermanent = new Employee("Tabo", "Lisa",9876);
        Employee employeePartT =new Employee("Tabo","Lisa",9876);
        assertThat(empPermanent,is(employeePartT));

    }

    @Test
    public void testIdentity(){

        Employee empPermanent = new Employee();
        Employee empPT = new Employee();
        assertSame(empPermanent,is(empPT));

    }

    @Test
    public void testFail(){
        int i;
        i = (2*8);
        assertThat(String.valueOf(2 * 8),
                18,
                is(i));

    }

    public void testTimeout(){



    }

    public void testDisable(){

    }
}
