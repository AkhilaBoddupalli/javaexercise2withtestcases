package com.stackroute.javape2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentgradesTest {
    Studentgrades obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new Studentgrades();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }

    @Before
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");

    }

    @After
    public void tearDownAfterClass() {
        System.out.println("AfterClass");

    }

    @Test
    public void givenNumberShouldReturnSum()
    {
        //Act
        int resultarray[]={25,25,25,25};
        assertEquals(100,obj.calculateGrades(resultarray));


//            int result = obj.calculateGrades(new int[]{1,2,3,4,6});
//            //Assert
//            assertEquals("", "16", result);
        }


    public void givenNumberShouldReturnAverage()
    {
        //Act
        int array[]={1,2,3,4,5};

        //Assert
        assertEquals("", "3", obj.calculateGrades(array));
    }

}

