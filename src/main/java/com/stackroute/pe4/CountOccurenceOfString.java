
//1. Write a java program to count the total number of occurrences of a given character in a ​ string
//without using any loop?
//For Example- Java is java again java again count number of occurrence of a in the given ​

package main.java.com.stackroute.pe4;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOccurenceOfString {
    public int findOccurrences(String word) {

        // split the string by spaces in a
        String a[] = word.split(" ");

        // search for pattern in a string
        int count = 0, i = 0;

        if (word.equals(a[i])) {
            count++;
        }
        return count;
    }
}


/*
 if(inputString==null || inputString==" ")
         {
         count=-1;
         }
         //gives the number of occurrences of a given letter in the word.
         else {
         for (int i = 0; i < inputString.length(); i++)
        {
        if (letter == inputString.charAt(i))
        {
        count = count + 1;
        }
        }
        }
        return count;
        }*/