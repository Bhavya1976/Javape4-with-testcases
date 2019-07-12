package main.test.com.stackroute.pe4;

import main.java.com.stackroute.pe4.RegularExpression;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegularExpressionTest {
    RegularExpression expression ;
    @Before
    public void setUp(){
        expression = new RegularExpression();
    }
    @After
    public void tearDown(){
        expression = null;
    }
    @Test
    public void givenInputShouldReturnNameOfThePersonInCapitalLetter(){
        boolean actual = expression.checkForStringName("Harry");

        assertEquals(true,actual);
    }
    @Test
    public void givenInputShouldReturnNameOfThePersonInSmallLetter(){
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

    }
}
