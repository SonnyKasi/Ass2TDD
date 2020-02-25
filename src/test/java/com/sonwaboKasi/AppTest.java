package com.sonwaboKasi;

import org.junit.*;
import org.junit.rules.Timeout;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Employee empPermanent;
    private Employee empPT;

    @Rule
    public Timeout globalTimeout = new Timeout(2000);


    @AfterClass
    public static void afterClass() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
         empPermanent= new Employee();
         empPT = new Employee();


    }

    @Test
    public void testEquality(){

         empPermanent = new Employee("Tabo", "Lisa",9876);
         empPT =new Employee("Tabo","Lisa",9876);
        assertThat(empPermanent,is(empPT));

    }

    @Test
    public void testIdentity(){

        Employee empPermanent = new Employee();
        Employee empPT = new Employee();
        Assert.assertNotSame(empPermanent,empPT);

    }


    @Test
    public void testFail(){
        int i;
        i = (2*8);
        assertThat(String.valueOf(2 * 8),
                18,
                is(i));

    }

    @Test (timeout = 1000)
    public void testTimeout()throws InterruptedException
    {
        //while (true){
            //Thread.currentThread().sleep(1000);
        assertThat(0, is(empPermanent.getEmpNum()));

        }




    @Ignore
    @Test
    public void testDisable(){
        System.out.println("This test will not execute!");

    }
}
