package main.java.com.stackroute.pe4;

import java.util.regex.Pattern;

public class RegularExpression {

    public boolean checkForStringName(String input) {

        boolean isMatch ;
            if (input != null) {

                String pattern = ".*Harry|harry.*";

                 isMatch = Pattern.matches(pattern, input);
                System.out.println(isMatch);

            }
            else if(input==null)
            {
                isMatch = false;
            }
            else{
                isMatch = false;
            }
            return isMatch;

         }
    }

