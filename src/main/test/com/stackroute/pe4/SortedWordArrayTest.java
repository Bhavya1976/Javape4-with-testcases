package main.test.com.stackroute.pe4;


import main.java.com.stackroute.pe4.SortedWordArray;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortedWordArrayTest {
    SortedWordArray sorted;
    @Before
    public void setUp(){
        sorted = new SortedWordArray();
    }
    @After
    public void tearDown(){
        sorted = null;
    }
    @Test
    public void givenInputShouldReturnSortedWordArray(){
        String  actual = sorted.isSortedWordOfArray("A string is a data type used in programming.");

        assertEquals("A,\n" +
                "a,\n" +
                "data,\n" +
                "in,\n" +
                "is,\n" +
                "string,\n" +
                "type,\n" +
                "used,\n" +
                "programming.\n",actual);
    }/*
    @Test
    public void givenInputShouldReturn(){
        boolean actual = expression.checkForStringName("harry");

        assertEquals(true,actual);
    }
    @Test
    public void givenInputShouldReturnFalseOutput(){
        boolean actual = expression.checkForStringName("Sujatha");
        boolean result = false;

        assertEquals(result,actual);

    }
    @Test
    public void givenInputShouldReturnNullOutput(){
        boolean actual = expression.checkForStringName("");
        boolean result = false;

        assertEquals(result,actual);

    }*/
}
