package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.FoundTheOccurence;
//import main.java.com.stackroute.pe4.FoundTheOccurence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FoundTheOccurenceTest {

    FoundTheOccurence find;
    @Before
    public void setUp(){
        find=new FoundTheOccurence();

    }
    @After
    public void tearDown()
    {
        find=null;
    }
    @Test
    public void givenStringInputShouldReturnOccurrencesFOundPosition()
    {
        String actual=find.countChars("She sells seashells by the seashore","se");
        assertEquals(" Found at 4 6 Found at 10 12 Found at 27 29",actual);

    }
    @Test
    public void givenEmptyStringShouldReturnEmptyString()
    {
        String actual=find.countChars("","se");
        assertEquals("Pattern not matched",actual);
    }
   
}
