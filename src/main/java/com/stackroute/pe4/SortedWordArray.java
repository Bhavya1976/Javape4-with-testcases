/*Write a program that ​ sets​ up a ​ String​ variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sor*/

package main.java.com.stackroute.pe4;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.lang.Class;

public class SortedWordArray {
    public String isSortedWordOfArray(String input) {

        int i=0,j;

        String temp="";
        String strArray[] = input.split(" ");
          int size = strArray.length;

      /*  for( i=0; i < size -1; i++){
            System.out.println(strArray[i]);
        }*/
        for ( i = 0; i < size-1; i++)
        {
            for ( j = i + 1; j < size-1; j++)
            {
                if (strArray[i].compareTo(strArray[j])>0)
                {
                    temp = strArray[i];
                    strArray[i] = strArray[j];
                    strArray[j] = temp;
                }
            }
        }
        //System.out.print("Names in Sorted Order:");
        for ( i = 0; i < size- 1; i++)
        {
            System.out.println(strArray[i] + ",");
        }
        System.out.println(strArray[size - 1]);
        return strArray[i];
    }


  public static void main(String[] args){
        SortedWordArray sorted = new SortedWordArray();
        sorted.isSortedWordOfArray("A string is a data type used in programming.");

    }

}



