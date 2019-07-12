package main.java.com.stackroute.pe4;

import java.util.Scanner;

public class ReplaceCharacter {
public static String replaceCharacterWithNewCharacter(String str){

    Scanner scanner = new Scanner(System. in);
    str = scanner.nextLine();

    String new_str1 = str.replace('d', 'f');
    String new_str2 = str.replace('l', 't');

    System.out.println(new_str1);
    System.out.println(new_str2);

    return null;
}



}
