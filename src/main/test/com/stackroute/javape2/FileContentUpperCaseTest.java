package com.stackroute.javape2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class FileContentUpperCaseTest {
    private static FileContentUpperCase obj;
    @BeforeClass
    public static void setup() {
// This methods runs, before running any one of the test case
// This method is used to initialize the required variables
        obj = new FileContentUpperCase();
    }
    @AfterClass
    public static void teardown() {
// This method runs, after running all the test cases
// This method is used to clear the initialized variables
        obj = null;
    }
    @Test
    public void getUpperCase() throws IOException {
// getting the file from resources folder
        File file = new File("/home/akhila/Desktop/hello.txt");
        assertEquals("HELLO HI HOW ARE YOU",obj.getUpperCase(file.getAbsolutePath()));// checking excepted inputs and actul inputs//
        assertNull("The return value should be null",obj.getUpperCase(""));
    }

}