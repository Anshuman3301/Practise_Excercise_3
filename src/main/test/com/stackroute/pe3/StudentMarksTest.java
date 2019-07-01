package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {

    StudentMarks ob;
    @Before
    public void setUp() throws Exception {
        ob=new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void givenAnArrayOfGradesReturnsItsValidity()
    {
        int[] marks={1,2,3,4,5,78};
        String result=ob.checkValidity(marks);
        assertEquals("Valid", result);
    }
}