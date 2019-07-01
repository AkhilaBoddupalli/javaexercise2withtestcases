package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class MemberTest {
    Member obj;

    Member.MemberVariable obj1;
    @BeforeClass
    public static void setUpOnce() {


    }

    @AfterClass
    public static void teardownOnce() {


    }

    @Before
    public void setUp() {

        obj=  new Member();
        obj1 = obj.new MemberVariable();
    }

    @After
    public void tearDown() {

        obj= null;
    }

    @Test
    public void givenNameAgeSalaryShouldDispalyAllofThem() {
        //Arrange
        String [] expectedValue = {"Harry Potter", "30", "2500.3"};

        //Act
        String [] actualValue = obj1.isMember("Harry Potter",30,2500.3);
        //Assert
        assertArrayEquals(expectedValue, actualValue);

        //assertNotNull(actualValue);

    }


}






