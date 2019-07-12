package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.ReplaceCharacter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceCharacterTest {

    ReplaceCharacter replace;

    @Before
    public void setUp(){
        replace = new ReplaceCharacter();

    }
    @After
    public void tearDown()
    {

        replace = null;
    }
    @Test
    public void givenStringInputShouldReturnCountOfTheWordsFromAString()
    {
        String actual=replace.replaceCharacterWithNewCharacter( "Java is java again java again");
        String expected ="";
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
