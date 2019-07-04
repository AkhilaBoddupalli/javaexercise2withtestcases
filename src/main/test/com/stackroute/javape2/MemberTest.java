package com.stackroute.javape2;

import org.junit.*;

import static org.junit.Assert.*;

public class MemberTest {
    Member obj;

    Member.MemberVariable obj1;
@Before
public void setUp() {
    System.out.println("Before");
    obj = new Member();
}

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }

    @Before
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");
        obj=  new Member();
       obj1 = obj.new MemberVariable();

    }

    @After
    public void tearDownAfterClass() {
        System.out.println("AfterClass");

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






