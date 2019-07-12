package main.java.com.stackroute.pe4;


import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FoundTheOccurence {

    public String countChars(String input, String word) {


        String result = "";

            if (input.contains(word)) {
                //matches the pattern
                Pattern pattern = Pattern.compile(word);
                Matcher matcher = pattern.matcher(input);
                //Checks for the start and end index of the pattern in the given inputString
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    result = result + " " + "Found at " + start + " " + end;
                }
            } else {
                result = "Pattern not matched";
            }

        return result;
    }
}
