package nyc.c4q.jorgereina1986;

import java.util.Scanner;

/**
 * Created by Jorge Reina and Kenny's assistance (TA) on 3/28/15.
 */
public class Unique {


    public static String uniqueCharacters(String s) {
        String s2 = "";

        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if(!s2.contains(c+"")) {
                s2 += c;
            }

        }




        return s2;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Please write something: ");
        String s = input.nextLine();                       //input goes to String S

        System.out.println(uniqueCharacters(s));


    }
}