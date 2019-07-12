package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.CountOccurenceOfString;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurenceOfStringTest {
CountOccurenceOfString count;

@Before
public void setUp(){
    count = new CountOccurenceOfString();

}
@After
    public void tearDown()
    {

        count = null;
    }
    @Test
    public void givenStringInputShouldReturnCountOfTheWordsFromAString()
    {
        int actual=count.findOccurrences( "Java is java again java again");
        int expected =0;
        assertEquals(actual,expected);
    }

    @Test
    public void givenNullStringInputShouldReturnNull()
    {


    }
    @Test
    public void givenEmptyInputShouldReturnNull()
    {

    }


    {

}
}
